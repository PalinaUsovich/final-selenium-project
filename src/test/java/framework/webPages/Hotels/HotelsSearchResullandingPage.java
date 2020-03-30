package framework.webPages.Hotels;

import framework.webPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.*;

public class HotelsSearchResullandingPage extends BasePage {
    HotelsHomePage hotelsHomePage = new HotelsHomePage();

    private By starCheckBox = By.id("filter-star-rating-contents");
    public String firstPart = "//input[@id='f-star-rating-";
    public String secondPart = "']";
    private By wantToSeeMoreObject = By.xpath("//div[@class='additional-info']");
    private By hotels5filtered = By.xpath("//span[@class='star-rating-text star-rating-text-strong']");
    private By hotels3filtered = By.xpath("//span[@class='star-rating-text']");
    private By todayDealPrice = By.xpath("//ins[contains(text(),'$135')]");
    private By landmarkButton = By.xpath("//h3[contains(text(),'Landmarks')]");
    private By landmarksCheckBox = By.xpath("//div[@id='filter-landmarks-contents']//input[@name='f-lid']");

    //JavascriptExecutor jsScrollBy = (JavascriptExecutor)driver;
//jsScrollBy.executeScript("scrollBy(0,400);");

    public void clickOnLandMarkButton() {
        clickOn(landmarkButton);

    public void selectStar(String starValue) {
        clickOn(By.xpath(firstPart + starValue + secondPart));
    }
    public boolean listFilteredHotels() {
        List<WebElement> hotels = (SharedSD.getDriver().findElements(hotels5filtered));
        for (WebElement hotel:hotels){
            String hotelRatingText = hotel.getText();
            List <String>list = new ArrayList<>(Arrays.asList(hotelRatingText.split("")));
            JavascriptExecutor je = (JavascriptExecutor)SharedSD.getDriver();
            WebElement element = SharedSD.getDriver().findElement(wantToSeeMoreObject);
            
            je.executeScript("arguments[0].scrollIntoView(true);",element);
            Set<String> uniqueRating = new HashSet(list);
            Assert.assertTrue(uniqueRating.size() == 1 && uniqueRating.equals("5-star"),"");

        }
        // using loop, pick each text, and do text.equals("5-star")
        // OR
        // Set<String> uniqueRating = new HashSet(ratingTexts); //uniqueRating = ["5-star"]
        // Assert.assertTrue(uniqueRating.size() == 1 && uniqueRating.get(0).equals("5-star"), "")
                return false;
       }
    }

    public void verifyPriceDeal() {
        String dealText = getTextFromElement(todayDealPrice);
        System.out.println(dealText);
        Integer newDeal = Integer.valueOf(dealText);
        if (newDeal < 200) {
            System.out.println("Today's deal is less than 200 dollars");
        }
    }

}










