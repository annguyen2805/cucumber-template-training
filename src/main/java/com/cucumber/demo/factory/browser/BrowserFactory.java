package com.cucumber.demo.factory.browser;

import org.openqa.selenium.WebDriver;

public interface BrowserFactory {
    public abstract WebDriver getBrowserDriver();
}
