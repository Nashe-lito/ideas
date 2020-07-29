package acceptance.shald;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BuyToOneClickTest extends WebDriverSettings{

  @Test
  public void testBuyToOneClick() {
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

    productPage.openModalOneClickBuy();
    productPage.fillName("Test");
    productPage.fillPhone("996156666");
    productPage.clickBuyButton();
    productPage.clickToGoButton();
  }
}
