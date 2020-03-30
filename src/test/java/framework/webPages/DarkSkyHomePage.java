package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class DarkSkyHomePage extends BasePage {
    private By searchtextField = By.id("searchForm");
    private By DarkSkyApiButton = By.xpath(" //div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By darkSkyCurrentTemp = By.xpath("(//span[starts-with(@class, 'summary')])[1]");
    private By timeLineTemp = By.xpath("//div[@id='timeline']//div[@class = 'temps']//span//span");
    private By timeLineHours = By.xpath("//div[@id='timeline']//div[@class = 'hours']//span[@class = 'hour']/span");
    private By darSkyExpandButton = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1] ");
    private By minTimelineTempToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'minTemp']");
    private By maxTimelineTempToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'maxTemp']");
    private By lowestTempToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'highTemp')]//span[@class = 'temp']");
    private By highestTempToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'lowTemp')]//span[@class = 'temp']");
    public void clickOnDarkSkyButton() {
        clickOn(DarkSkyApiButton);
    }
    public void clickOnDarkSkyExpandButton(){
        clickOn(darSkyExpandButton);
    }


    public List<String> getTimeLineTemperatures() {
        List<String> temperaturesText = new ArrayList<>();
        ArrayList<WebElement> timeTemps = (ArrayList<WebElement>) SharedSD.getDriver().findElements(timeLineTemp);

        for (WebElement temp : timeTemps) {
            String tempText = temp.getText();
            temperaturesText.add(tempText);
        }
        return temperaturesText;
    }

    public List<Integer> getSortedIntegers() {

        //empty Integerlist
        List<Integer> tempInteger = new ArrayList<>();
        for (String temperature : getTimeLineTemperatures()) {
            tempInteger.add(Integer.valueOf(temperature.substring(0, temperature.length() - 1)));
        }
        Collections.sort(tempInteger);

        return tempInteger;

    }


       public int getCurrentTemp(){
        String currentTempText = getTextFromElement(darkSkyCurrentTemp);
        String currentTemp= currentTempText.split("°")[0];
        return Integer.parseInt(currentTemp);
       }
        public int getMaxTemp(){
        List<String>timeLineTemp = getTimeLineTemperatures();
        String maxTemp = Collections.max(timeLineTemp).replace("°","");
        return Integer.parseInt(maxTemp);
        }
        public int getMinTemp(){
        List<String>timeLineTemp =getTimeLineTemperatures();
        String minTemp = Collections.min(timeLineTemp).replace("°","");
        return Integer.parseInt(minTemp);
        }
        public boolean assertCurrTemp (int currentTemp,int maxTemp,int minTemp){
        return currentTemp<=maxTemp && currentTemp>=minTemp;
    }
    public String getMinTempToday(){
        return getTextFromElement(minTimelineTempToday);
    }
    public String getMaxTempToday(){
        return getTextFromElement(maxTimelineTempToday);
    }
    public String getLowest(){
        return getTextFromElement(lowestTempToday);
    }
    public String getHighest(){
        return getTextFromElement(highestTempToday);

    }
//    public List<String>getHours(){
//        return getValue(timeLineHours);
//    }

//    Scenario: Verify individual day temp timeline
//    Given I am on Darksky Home Page
//    When I expand todays timeline
//    Then I verify lowest and highest temp is displayed correctly
//


}






