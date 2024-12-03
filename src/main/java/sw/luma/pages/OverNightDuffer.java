package sw.luma.pages;

import org.openqa.selenium.By;
import sw.luma.utilities.Utility;

public class OverNightDuffer extends Utility {
    By clickOnjOverNightDuffer = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By changeTheQuantity = By.xpath("(//input[@class='input-text qty'])[1]");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By GetSuccessMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By quantityOfProduct = By.xpath("//input[@title='Qty']");
    By priceOfProduct = By.xpath("//span[@class='cart-price']//span)[2]");
    By clickOnUpdateButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public String setClickOnjOverNightDuffer(){
        return getTextFromElement(clickOnjOverNightDuffer);
    }
    public void changeQuantity(String qty){
        sendTextToElementWithClearText(changeTheQuantity,qty);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getSuccessMessageOfAddToCart(){
        return getTextFromElement(GetSuccessMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String getQuantityOfProduct(){
        return getTextFromElement(quantityOfProduct);
    }
    public String getPriceOfProduct(){
        return getTextFromElement(priceOfProduct);
    }
    public void clickOnUpdateButton(){
        clickOnElement(clickOnUpdateButton);
    }

}
