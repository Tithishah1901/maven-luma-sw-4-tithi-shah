package sw.luma.testsuit;

import org.testng.Assert;
import org.testng.annotations.Test;
import sw.luma.pages.Homepage;
import sw.luma.pages.Pants;
import sw.luma.testbase.BaseTest;

public class MenTest extends BaseTest {
    Homepage homepage = new Homepage();
    Pants pants = new Pants();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homepage.clickOnConsent();
        //* Mouse Hover on the ‘Men’ Menu
        homepage.setMouseHoverOnMenMenu();
        //* Mouse Hover on the ‘Bottoms’
        homepage.setMouseHoverOnBottoms();
        Thread.sleep(3000);
        //* Click on the ‘Pants’
        homepage.setClickOnBottoms();
        //* Mouse Hover on the product name
        pants.setSortByProductName();
        //‘Cronus Yoga Pant’ and click on the size 32.
        pants.setMouseHoverOnCronusYogaPant();
        pants.setClickOnSize32();
//        * Mouse Hover on the product name‘Cronus Yoga Pant’ and click on the Color Black.
        pants.setMouseHoverOnCronusYogaPant();
        pants.setClickOnColorBlack();
        //* Mouse Hover on the product name‘Cronus Yoga Pant’ and click on the‘Add To Cart’ Button.
        pants.setMouseHoverOnCronusYogaPant();
        pants.clickOnAddToCart();
        //* Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(pants.getSuccessMessageOfAddToCart(),
                "You added Cronus Yoga Pant to your shopping cart.",
                "Product not added in cart!");
        //* Click on the ‘shopping cart’ Link into message
        pants.setClickOnShoppingCartLink();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(pants.setShoppingCartTitle(),
                "Shopping Cart",
                "page title Mismatch!");
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(pants.setMouseHoverOnCronusYogaPant(),
                "Cronus Yoga Pant",
                "Product name Mismatch!");
        //* Verify the product size ‘32’
        Assert.assertEquals(pants.setClickOnSize32(),
                "32",
                "Product size Mismatch!");
        //* Verify the product color ‘Black’
        Assert.assertEquals(pants.setClickOnColorBlack(),
                "Black",
                "Product color Mismatch!");

    }
}
