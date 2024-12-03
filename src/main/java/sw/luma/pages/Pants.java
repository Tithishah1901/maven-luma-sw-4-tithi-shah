package sw.luma.pages;

import org.openqa.selenium.By;
import sw.luma.utilities.Utility;

public class Pants extends Utility {

    By sortByProductName = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By mouseHoverOnCronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnSize32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By clickOnColorBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By clickOnAddToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    By successMessageOfAddToCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingCartTitle = By.xpath("//span[@class='base']");

    public void setSortByProductName() {
        selectByVisibleTextFromDropDown(sortByProductName, "Product Name");
    }
    public String setMouseHoverOnCronusYogaPant(){
       return getTextFromElement(mouseHoverOnCronusYogaPant);
    }
    public String setClickOnSize32(){
       return getTextFromElement(clickOnSize32);
    }
    public String setClickOnColorBlack(){
       return getTextFromElement(clickOnColorBlack);
    }
    public void clickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
    }
    public String getSuccessMessageOfAddToCart(){
       return getTextFromElement(successMessageOfAddToCart);
    }
    public void setClickOnShoppingCartLink(){
        clickOnElement(clickOnShoppingCartLink);
    }
    public String setShoppingCartTitle(){
       return getTextFromElement(shoppingCartTitle);
    }

}
