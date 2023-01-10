package com.cucumber.demo.stepdefinition;

import com.cucumber.demo.core.BaseSteps;
import com.cucumber.demo.pageobject.PageGeneratorManager;
import com.cucumber.demo.Hook;
import com.cucumber.demo.pageobject.HomePageObject;
import com.cucumber.demo.pageobject.PricingPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PricingStepdefs extends BaseSteps {
    private HomePageObject homePage;
    private PricingPageObject pricingPage;
    private WebDriver driver;

    public PricingStepdefs() {
        this.driver = Hook.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePageObject(driver);
        pricingPage = PageGeneratorManager.getPricingPageObject(driver);
    }

    @Given("I went to the Sleek SG {string} page")
    public void iWentToTheSleekSGPage(String arg0) {
        homePage.navigataToHomePage();
    }

    @When("I click on the {string} link")
    public void iClickOnTheLink(String arg0) {
        homePage.navigataToPricingPage();
    }

    @Then("I should be navigated to the Sleek SG {string} page")
    public void iShouldBeNavigatedToTheSleekSGPage(String arg0) {
        homePage.verifyHomeDisplayed();
    }

//    @Given("I am on the Sleek SG {string} page")
//    public void iAmOnTheSleekSGPage(String arg0) {
//    }
//
//    @Then("Verify corporate secretary details are correct: {string} {string}")
//    public void verifyCorporateSecretaryDetailsAreCorrect(String arg0, String arg1) {
//    }
}
