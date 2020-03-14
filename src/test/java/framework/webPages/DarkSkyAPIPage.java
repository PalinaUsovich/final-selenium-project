package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyAPIPage extends BasePage{

    private By DarkSkySignUpButton = By.xpath("//a[@class='button filled']");
    public void clickOnSignUpButton(){
        clickOn(DarkSkySignUpButton);
    }

}
