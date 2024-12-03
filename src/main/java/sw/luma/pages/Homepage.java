package sw.luma.pages;

import org.openqa.selenium.By;
import sw.luma.utilities.Utility;

public class Homepage extends Utility {

    By clickOnConsent = By.xpath("//p[text()='Consent']");
    By mouseHoverOnWomenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By mouseHoverOnTop = By.xpath("(//a[@id='ui-id-9'])[1]");
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By mouseHoverOnMenMenu = By.xpath("//span[normalize-space()='Men']");
    By mouseHoverOnBottoms = By.xpath("//a[@id='ui-id-18']");
    By clickOnBottoms = By.xpath("//a[@id='ui-id-23']");
    By mouseHoverOnGear = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");


    public void clickOnConsent(){
        clickOnElement(clickOnConsent);
    }
     public void setMouseHoverOnWomenMenu(){
        mouseHoverToElement(mouseHoverOnWomenMenu);
}
       public void setMouseHoverOnTop(){
        mouseHoverToElement(mouseHoverOnTop);
 }
    public void setClickOnJacket(){
        mouseHoverToElementAndClick(clickOnJacket);
    }
    public void setMouseHoverOnMenMenu(){
        mouseHoverToElement(mouseHoverOnMenMenu);
    }
    public void setMouseHoverOnBottoms(){
        mouseHoverToElement(mouseHoverOnBottoms);
    }
    public void setClickOnBottoms(){
        mouseHoverToElementAndClick(clickOnBottoms);
    }
    public void setMouseHoverOnGear(){
        mouseHoverToElement(mouseHoverOnGear);
    }
    public void setClickOnBags(){
        mouseHoverToElementAndClick(clickOnBags);
    }

}
