package com.cucumber.demo.pageobject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class PricingPageObject {
    private WebDriver driver;

    public PricingPageObject(WebDriver driver) {
        this.driver = driver;
    }
}
