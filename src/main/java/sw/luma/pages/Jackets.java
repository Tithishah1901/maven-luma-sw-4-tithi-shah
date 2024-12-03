package sw.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.luma.utilities.Utility;

import java.util.List;

public class Jackets extends Utility {

    By sortByProductName = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");
    By sortByPrice = By.xpath("//div[@class='page-wrapper']//div[2]//div[3]//select[1]");
    By nameListOfProduct = By.xpath("//strong[@class='product name product-item-name']//a");
    By priceListOfProduct = By.xpath("//span[@class='price-wrapper ']//span");

    public void setSortByProductName() {
        selectByVisibleTextFromDropDown(sortByProductName, "Product Name");
    }
    public void setSortByPrice(){
        selectByVisibleTextFromDropDown(sortByPrice,"Price");
    }
    public List<WebElement> getListOfProductName(){
        return getListOfElements(nameListOfProduct);
    }
    public List<WebElement> getListOfProductPrice(){
        return getListOfElements(priceListOfProduct);
    }

}

