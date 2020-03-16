package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.*;
import org.testng.Assert;

public class DarkSkySD {
    private DarkSkyHomePage darkSkyHomepage = new DarkSkyHomePage();
    private DarkSkyRegisterPage darkSkyRegisterPage = new DarkSkyRegisterPage();
    private DarkSkyAPIPage darkSkyAPIPage = new DarkSkyAPIPage();

    @Given("^I am on the DarkSky Register page$")
    public void iAmOnDarkSkyHomePage() throws InterruptedException {
       // darkSkyHomepage.enterAddress("New York");
         Thread.sleep(2000);
        darkSkyHomepage.clickOnDarkSkyButton();
        Thread.sleep(2000);
       // Assert.assert
    }
    @When ("^I click on sign Up button$")
    public void iClickOnSignUpButton () throws InterruptedException {
        Thread.sleep(2000);
        darkSkyAPIPage.clickOnSignUpButton();
    }


    @When("^I click on register button$")
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(2000);
        darkSkyRegisterPage.clickOnRegisterButton();
    }

    @Then("^I verify I am on register page by asserting Register header$")
    public void verifyRegisterHeader() {
        Assert.assertTrue(darkSkyRegisterPage.isRegisterHeaderDisplayed());

    }


}

























