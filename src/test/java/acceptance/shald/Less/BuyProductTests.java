package acceptance.shald.Less;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductTests extends Wd {
  @Test
  public void test2() {
    driver.navigate().to("https://shield.whileweb.com/index.php?route=product/product&path=86_89&product_id=54");
    driver.findElement(By.id("button-cart")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='jq-toast-single']")));
    driver.findElement(By.id("cart-total")).click();
    driver.findElement(By.cssSelector("[class=\"btn\"]")).click();

    String url = driver.getCurrentUrl();
    Assert.assertTrue(url.equals("https://shield.whileweb.com/simplecheckout/"));


  }
}
