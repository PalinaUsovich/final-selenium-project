package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyHomePage extends BasePage {
    private By searchtextField = By.id("searchForm");
    private By DarkSkyApiButton = By.xpath(" //div[@class='inner']//a[contains(text(),'Dark SkyAPI')]");

    //public void enterAddress(String value){
  //      setValue(searchtextField,value);
  //  }

    public void clickOnDarkSkyButton(){
        clickOn(DarkSkyApiButton);
    }

}
