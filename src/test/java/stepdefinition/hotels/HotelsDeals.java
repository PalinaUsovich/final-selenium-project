package stepdefinition.hotels;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.Hotels.HotelsHomePage;
import framework.webPages.Hotels.HotelsSearchResullandingPage;
import org.testng.Assert;

public class HotelsDeals {
    HotelsHomePage hotelsHomePage = new HotelsHomePage();
    HotelsSearchResullandingPage hotelsSearchResullandingPage = new HotelsSearchResullandingPage();



    @Given("^I am on Hotels HomePage$")
    public void iAmOnHotelsHomePage() throws InterruptedException {
        //to do verify title
        Thread.sleep(3000);
        Assert.assertEquals(hotelsHomePage.getHotelTitle(), "Where to?");
    }
       @When("^I enter destination $")
       public void iEnterDestination() throws InterruptedException {
           Thread.sleep(3000);
           hotelsHomePage.enterDestination("Honolulu");
       }
       @And("^I navigate to search result page $")
       public void iNavigateToSearchResultPage(){
           hotelsHomePage.clickOnHotelsSearchButton();
       }


       @Then("^I verify todays deal is less than (.*)$")
                public void iVerifyTodaysDealIsLessThan200() {
        hotelsSearchResullandingPage.verifyPriceDeal();

        }


}
