package com.cucumber.demo.stepdefinition;

import com.cucumber.demo.Hook;
import com.cucumber.demo.pageobject.HomePageObject;
import com.cucumber.demo.pageobject.PageGeneratorManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStepdefs {
    private WebDriver driver;
    private HomePageObject homePage;

    public LoginStepdefs(){
        this.driver = Hook.openAndQuitBrowser();
        homePage = PageGeneratorManager.getHomePageObject(driver);
    }


    @Given("^I navigate to Login page$")
    public void iNavigateToLoginPage() {
        homePage.navigataToLoginPage();
    }

    @When("I input username with {string} {int}")
    public void iInputUsernameWith(String arg0, int value2) {

    }

    @And("I input password with {string}")
    public void iInputPasswordWith(String arg0) {

    }

    @And("I submit login")
    public void iSubmitLogin() {
    }

    @Then("I should be message login successfull")
    public void iShouldBeMessageLoginSuccessfull() {

    }

    @And("I should be homepage displayed")
    public void iShouldBeHomepageDisplayed() {

    }
}
