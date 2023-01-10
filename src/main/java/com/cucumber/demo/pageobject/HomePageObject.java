package com.cucumber.demo.pageobject;

import com.cucumber.demo.pageui.HomePageUI;
import com.cucumber.demo.pageui.PricingPageUI;
import com.cucumber.demo.core.BasePage;
import com.cucumber.demo.helper.config.IServer;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class HomePageObject extends BasePage {
    private WebDriver driver;
    private IServer server;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void navigataToHomePage() {
        server = ConfigFactory.create(IServer.class);
        openUrl(driver, server.url());
    }

    public void navigataToPricingPage() {
        clickToElement(driver, HomePageUI.PRICE_BTN);
    }

    public void verifyHomeDisplayed() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getTitle(driver), "All Services - Sleek");
        softAssert.assertTrue(isElementDisplay(driver, PricingPageUI.HEADER_MSG));
        softAssert.assertAll();
    }

    public void navigataToLoginPage() {

    }
}
