package framework.webPages;


import org.openqa.selenium.By;
import org.testng.Assert;

public class DarkSkyRegisterPage extends BasePage{

    private By darkSkyRegisterButton = By.xpath(" //button[contains(text(),'Register')]");
    private By darkSkyRegisterHeader = By.xpath("//h1[@class='stand-alone title']");

    public void clickOnDarkSkyRegisterButton(){
        clickOn(darkSkyRegisterButton);
    }
    public String getPageHeader() {
        return getTextFromElement(darkSkyRegisterHeader);
    }

    }





