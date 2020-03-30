package stepdefinition.hotels;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.Hotels.HotelsHomePage;
import framework.webPages.Hotels.HotelsSearchResullandingPage;
import org.testng.Assert;

public class HotelsRoomsDropDown {
    HotelsHomePage hotelsHomePage = new HotelsHomePage();
    HotelsSearchResullandingPage hotelsSearchResullandingPage = new HotelsSearchResullandingPage();

    @Given("^I am on Hotels HomePage$")
    public void iAmOnHotelsHomePage() throws InterruptedException {

        //to do verify title
        Thread.sleep(3000);
        Assert.assertEquals(hotelsHomePage.getHotelTitle(), "Where to?");
    }
    @Then("^I select (.*) from room dropdown$")
    public void iSelectRoomsFromRoomDropDown (String roomNum) {
        hotelsSearchResullandingPage.selectFromDropDown(roomNum);


    }
    @And("^I verify (.*) is displayed$")
    public void iVerifyNumberOfRoomDropDownIsDisplayed() {

    }


}
