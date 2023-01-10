package com.cucumber.demo;

import com.cucumber.demo.factory.environment.LocalFactory;
import com.cucumber.demo.core.GlobalConstants;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class Hook {
    private static WebDriver driver;

    @Before
    public synchronized static WebDriver openAndQuitBrowser() {
        String browserName = System.getProperty("browser");
        if (driver == null) {
            try {
                if (browserName == null) {
                    browserName = System.getenv("BROWSER");
                    if (browserName == null) {
                        browserName = "chrome";
                    }
                }
                driver = new LocalFactory(browserName).createDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);

            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        return driver;
    }

    public static void close() {
        try {
            if (driver != null) {
                openAndQuitBrowser().quit();
            }
        } catch (UnreachableBrowserException e) {
            System.out.println("Can not close the browser");
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            close();
        }
    }
}
