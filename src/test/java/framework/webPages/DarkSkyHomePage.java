package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DarkSkyHomePage extends BasePage {
    private By searchtextField = By.id("searchForm");
    private By DarkSkyApiButton = By.xpath(" //div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By darkSkyCurrentTemp = By.xpath("//span[@class='summary swap']");
    private By tempList = By.xpath("//div[@id='timeline']//div[@class='temps']");
    private By darkSkyExpandButton = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1]");
    private By darkSkyMinTemp = By.xpath("//span[@class='minTemp']");
    private By darkSkyMaxTemp = By.xpath("//span[@class='maxTemp']");
    public void clickOnDarkSkyButton(){
        clickOn(DarkSkyApiButton);
    }
    public void clickOnDarkSkyExpandButton(){
        clickOn(darkSkyExpandButton);
    }





    public List <String> getTimeLineTemperatures() {
        List<String>temperaturesText = new ArrayList<>();
        ArrayList<WebElement> timeTemps = (ArrayList<WebElement>) SharedSD.getDriver().findElements(tempList);

        for (WebElement temp:timeTemps){
            String tempText = temp.getText();
            temperaturesText.add(tempText);
        }
        return temperaturesText;
    }
    public List<Integer>getIntegerList() {


        List<Integer> integerList = getTimeLineTemperatures().stream().map(Integer::parseInt).collect(Collectors.toList());
        for (int i=0;i<integerList.size();i++){

        }


        return integerList.get(i);

    }
    public void currentTempIntoInt( String  ) {
        List<WebElement>currentINT = SharedSD.getDriver().findElements(darkSkyCurrentTemp);
        String [] currentINTtext = new String [currentINT.size()];
        int i=0;
        for ( WebElement a:currentINT){
            currentINTtext[i]= a.getText();
            i++;
            Integer.parseInt(String.valueOf(currentINTtext));

        }

       // Integer.parseInt(String.valueOf(SharedSD.getDriver().findElements(darkSkyCurrentTemp)));

    }


    }

