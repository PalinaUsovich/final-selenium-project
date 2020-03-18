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
    private By darkSkyCurrentTemp = By.xpath("//span[@class='first']//span[contains(text(),'12°')]");
    private By tempList = By.xpath("//span[@class='summary swap']");
    private By darkSkyExpandButton = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1]");
    private By darkSkyMinTemp = By.xpath("//span[@class='minTemp']");
    private By darkSkyMaxTemp = By.xpath("//span[@class='maxTemp']");

    public void clickOnDarkSkyButton() {
        clickOn(DarkSkyApiButton);
    }

    public void clickOnDarkSkyExpandButton() {
        clickOn(darkSkyExpandButton);
    }


    public List<String> getTimeLineTemperatures() {
        List<String> temperaturesText = new ArrayList<>();
        ArrayList<WebElement> timeTemps = (ArrayList<WebElement>) SharedSD.getDriver().findElements(tempList);

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

        public String currentTemperatureAssert () {
            String newCurrTemp = SharedSD.getDriver().findElement(darkSkyCurrentTemp).getText();
            newCurrTemp.substring(0, newCurrTemp.length() - 1);
            return newCurrTemp;
            Assert.assertTrue(newCurrTemp>=);

    }




    }
}





