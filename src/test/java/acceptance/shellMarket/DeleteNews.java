package acceptance.shellMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersClass.class)

public class DeleteNews extends WebDriverSetting{

  @Test
  public void testDeleteNews() {
    for (int i = 0; i < 6; i++) {
      driver.navigate().to("https://shell-market.test.aurocraft.com/admin/articles/news/list");
      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("a[href=\"/admin/articles/news/create\"]")));

      driver.findElement(By.xpath("//tr[1]//td[7]//div[1]//button[1]")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class=\"close\"]")));
      driver.findElement(By.id("btn-delete-confirm")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"alert alert-success  alert-dismissable\"]")));
    }
  }
}
