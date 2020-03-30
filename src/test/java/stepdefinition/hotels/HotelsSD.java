package stepdefinition.hotels;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.Hotels.HotelsHomePage;
import framework.webPages.Hotels.HotelsSearchResullandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HotelsSD {
    HotelsHomePage hotelsHomePage = new HotelsHomePage();
    HotelsSearchResullandingPage hotelsSearchResullandingPage = new HotelsSearchResullandingPage();


    @Given("^I am on Hotels HomePage$")
    public void iAmOnHotelsHomePage() throws InterruptedException {
        //to do verify title
        Thread.sleep(3000);
        Assert.assertEquals(hotelsHomePage.getHotelTitle(), "Where to?");
    }

    @When("^I enter destination$")
    public void iEnterDestination() throws InterruptedException {
        Thread.sleep(3000);
        hotelsHomePage.enterDestination("Honolulu");
    }

    @And("^I navigate to search result page$")
    public void iNavigateToSearchResultPage() {
        hotelsHomePage.clickOnHotelsSearchButton();
    }

    @And("^I select property class (.+) stars$")
    public void iSelectPropertyClassStars(String checkBox) {
        hotelsSearchResullandingPage.(checkBox);
    }

    @Then("^I verify system displays only (.+) hotels on search result$")
    public void IVerifySystemDisplaysOnlyStarsHotelsOnSearchResult() {
        hotelsSearchResullandingPage.();

    }

}


//span[@class='star-rating-text star-rating-text-strong']4star/5
//span[@class='star-rating-text'] 3 star






