package sw.luma.testsuit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sw.luma.pages.Homepage;
import sw.luma.pages.Jackets;
import sw.luma.testbase.BaseTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    Homepage homepage = new Homepage();
    Jackets jackets = new Jackets();

//    Write down the following test in WomenTestclass
           @Test
           public void verifyTheSortByProductNameFilter() throws InterruptedException {
           homepage.clickOnConsent();
           //* Mouse Hover on the ‘Women’ Menu
            homepage.setMouseHoverOnWomenMenu();
            //* Mouse Hover on the ‘Tops’
            homepage.setMouseHoverOnTop();
            Thread.sleep(3000);
            //* Click on the ‘Jackets’
           homepage.setClickOnJacket();
            //* Select Sort By filter “Product Name”
               // After Sorting value
               List<String> jacketsNameListBefore = new ArrayList<>();
               for (WebElement value : jackets.getListOfProductName()) {
                   jacketsNameListBefore.add(value.getText());
               }
                   jackets.setSortByProductName();
                   //* Verify the product name displayed in alphabetical order
                   // After Sorting value
                   List<String> jacketsNameListAfter = new ArrayList<>();
                   for (WebElement value : jackets.getListOfProductName()) {
                       jacketsNameListAfter.add(value.getText());
                   }
                   // Sort the before name list into Ascending Order
                   jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order

                   Assert.assertEquals(jacketsNameListAfter, jacketsNameListBefore,
                           "Product is not sorting by alphabetical order");
               }

           @Test
         public void verifyTheSortByPriceFilter() {
               homepage.clickOnConsent();
               //* Mouse Hover on the ‘Women’ Menu
               homepage.setMouseHoverOnWomenMenu();
               //* Mouse Hover on the ‘Tops’
               homepage.setMouseHoverOnTop();
               //* Click on the ‘Jackets’
               homepage.setClickOnJacket();
              //* Select Sort By filter “Price”
               // Storing jackets price in list
               List<Double> jacketsPriceListBefore = new ArrayList<>();
               for (WebElement value : jackets.getListOfProductPrice()) {
                   //Converting price in to Double and Removing $ from price
                   jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
               }
               jackets.setSortByPrice();

               // After Sorting Products by Price
               List<Double> jacketsPriceListAfter = new ArrayList<>();
               for (WebElement value : jackets.getListOfProductPrice()) {
                   //Converting price in to Double and Removing $ from price
                   jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
               }
               // Sort the jacketPriceListBefore to Ascending Order
               Collections.sort(jacketsPriceListBefore);

               Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore,
                       "Product is not sorting by price");

           }
}

