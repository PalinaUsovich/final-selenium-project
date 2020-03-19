package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyHomePage;
import org.testng.Assert;

public class DarkSkyTemperatureSD {
    DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given ("^I am on DarkSky Home Page$")
    public void iAmOnDarkSkyHomePage () {


    }
    //#1

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void iVerifyCurrentTempIsNotGreaterOrLessThenTempsFromDailyTimeline(){
        int currentTemp = darkSkyHomePage.getCurrentTemp();
        int maxTemp = darkSkyHomePage.getMaxTemp();
        int minTemp = darkSkyHomePage.getMinTemp();
        boolean Range = darkSkyHomePage.assertCurrTemp(currentTemp,minTemp,maxTemp);
        Assert.assertTrue(Range,"currentTemp"+currentTemp+"is not in between"+maxTemp+"and"+minTemp);




    }
    //#3
    @When("^I expand todays timeline$")
    public void IExpandTodayTimeline() throws InterruptedException {
        Thread.sleep(3000);
        darkSkyHomePage.clickOnDarkSkyExpandButton();

    }

    @Then ("^I verify lowest and highest temp is displayed correctly$")
    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly () {
        String minTimeLineTemp = darkSkyHomePage.getMinTempToday();
        String maxTimeLineTemp = darkSkyHomePage.getMaxTempToday();
        String lowestTemp = darkSkyHomePage.getLowest();
        String highestTemp = darkSkyHomePage.getHighest();
        Assert.assertTrue(minTimeLineTemp.equals(lowestTemp),"Min Temp"+minTimeLineTemp+"doen not match with lowest temp "+lowestTemp);
        Assert.assertTrue((maxTimeLineTemp.equals(highestTemp)),"max Temp"+maxTimeLineTemp+"does not match with highest"+highestTemp);

        }






}
