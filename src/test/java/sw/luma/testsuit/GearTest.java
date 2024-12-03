package sw.luma.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import sw.luma.pages.Homepage;
import sw.luma.pages.OverNightDuffer;
import sw.luma.testbase.BaseTest;

public class GearTest extends BaseTest {
    Homepage homepage = new Homepage();
    OverNightDuffer overNightDuffer = new OverNightDuffer();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.clickOnConsent();
      //* Mouse Hover on the ‘Gear’ Menu
        homepage.setMouseHoverOnGear();
      //* Click on the ‘Bags’
       homepage.setClickOnBags();
        // * Click on Product Name ‘Overnight Duffle’
        overNightDuffer.setClickOnjOverNightDuffer();
        // * Change the Qty 3
        overNightDuffer.changeQuantity("3");
     //* Click on the ‘Add to Cart’ Button.
        overNightDuffer.clickOnAddToCart();
    //* Verify the text
        // ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(overNightDuffer.getSuccessMessageOfAddToCart(), "You added Overnight Duffle to your shopping cart.",
                "product not add in cart");
     //* Click on the ‘shopping cart’ Link into message
        overNightDuffer.clickOnShoppingCart();
    //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(overNightDuffer.setClickOnjOverNightDuffer(), "Overnight Duffle",
                "product name Mismatch");
    //* Verify the Qty is ‘3’
        Thread.sleep(2000);
      // Assert.assertEquals(overNightDuffer.getQuantityOfProduct(), "3",
         //       "Quantity Mismatch");
        // * Verify the product price ‘$135.00’
        Assert.assertEquals(overNightDuffer.getPriceOfProduct(), "$135.00",
                "Price Mismatch");
        //* Change the Qty to ‘5’
        overNightDuffer.changeQuantity("5");
        //* Click on the ‘Update Shopping Cart’ button
        overNightDuffer.clickOnUpdateButton();
   //* Verify the product price ‘$225.00’
        Thread.sleep(2000);
        Assert.assertEquals(overNightDuffer.getPriceOfProduct(), "$225.00",
                "Updated Price Mismatch");

    }
}
