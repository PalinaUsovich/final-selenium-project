package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.DarkSkyRegisterPage;
import framework.webPages.HomePage;
import org.testng.Assert;

public class DarkSkySD {
    private DarkSkyRegisterPage darkSkyRegisterPage = new DarkSkyRegisterPage();
    private HomePage homePage = new HomePage();

    @Given("^I am on home page$")

//?????????????????????????
    @When("^I click on (darkSkySignUpButton)on home screen$")
    public void iClickOnDarkSkySignUpButtonOnHomeScreen(String button) {
        switch (button) {
            case "login":
                homePage.clickOnLoginButton();
                break;

        }
        @Then("^I verify that i am a valid register page$")
        public void iVerifyThatIAmAValidRegisterPage () {
            Assert.assertEquals(darkSkyRegisterPage.getPageHeader(), "Register");

        }
        @And("^I click on (darkSkyRegisterButton)button on register page$")
        public void iClickOnDarkSkyRegisterButtonButtonOnRegisterPage (String button){
            switch (button) {
                case "login":
                    homePage.clickOnLoginButton();
                    break;


            }

            @And("^I verify i am a valid register page$")
            public void iVerifyIAmAValidRegisterPage () {
                Assert.assertEquals(darkSkyRegisterPage.getPageHeader(), "Register");
            }


        }
    }
}
