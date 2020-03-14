package framework.webPages;


import org.openqa.selenium.By;
import org.testng.Assert;

public class DarkSkyRegisterPage extends BasePage{

    private By darkSkyRegisterHeader = By.xpath("//h1[text()='Register']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')");

    public String getPageHeader() {
        return getTextFromElement(darkSkyRegisterHeader);
    }
    public void clickOnRegisterButton() {
        clickOn(registerButton);
    }
    public boolean isRegisterHeaderDisplayed(){
        return isElementDisplayed(darkSkyRegisterHeader);
    }

    }





