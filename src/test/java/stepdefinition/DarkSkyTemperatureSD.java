package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomePage;

public class DarkSkyTemperatureSD {
    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given ("^I am on DarkSky Home Page$")
    public void iAmOnDarkSkyHomePage () {


    }
    //#1

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void iVerifyCurrentTempIsNotGreaterOrLessThenTempsFromDailyTimeline(){

    }
    //#3
    @When("^I expand todays timeline$")
    public void IExpandTodayTimeline() {

    }




    @Then ("^I verify lowest and highest temp is displayed correctly$")
    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly () {

        }






}
