package framework.webPages.Hotels;

import framework.webPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.List;

public class HotelsHomePage extends BasePage {
    private By hotelsSearchField = By.xpath("qf-0q-destination");
    private By hotelsSearchButton = By.xpath("//button[@class='cta cta-strong'] ");
    private By hotelsTitle = By.xpath("//h1[@class='cont-hd-alt widget-query-heading'] ");
    private By roomsDropDown = By.id("qf-0q-rooms");
    private By roomsWebObjectCompareTo = By.xpath("//div[@class='widget-query-group widget-query-room-options']");

    public void enterDestination(String enterDestination) {

        setValue(hotelsSearchField, enterDestination);
    }

    public void clickOnHotelsSearchButton() {
        clickOn(hotelsSearchButton);
    }
    public String getHotelTitle() {
        return getTextFromElement(hotelsTitle);
    }
    public void countOfObjects () {
        int objects = (SharedSD.getDriver().findElements(roomsWebObjectCompareTo).size());
    }

    public void selectFromRoomsDropDownAndCompare() {
        List<WebElement> rooms = (SharedSD.getDriver().findElements(roomsDropDown));
        for (WebElement room: rooms) {
            String roomsText = room.getText();
            if (roomsText.equals()){
                System.out.println("rooms chosen ");
            }else    (roomsText.equals(9)  {
                System.out.println("9 rooms selected");

            }
        }






    }







