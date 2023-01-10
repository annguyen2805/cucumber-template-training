package com.cucumber.demo.pageobject;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
    private PageGeneratorManager(){

    }

    public static HomePageObject getHomePageObject(WebDriver driver){
        return new HomePageObject(driver);
    }

    public static PricingPageObject getPricingPageObject(WebDriver driver){
        return new PricingPageObject(driver);
    }
}
