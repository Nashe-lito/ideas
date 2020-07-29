package acceptance.shellMarket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;

@Listeners(ListenersClass.class)

public class CreateNews extends WebDriverSetting{

  @Test
  public void testCreateNews(){
    for (int i = 0; i < 1; i++){
    File photo = new File("src/test/resources/tumblr_p6kihfbHu11u2gtiio1_128.jpg");
    Random random = new Random();
    int r = random.nextInt(100) + 1;
    String title = "Title" + r;

    driver.get("https://shell-market.test.aurocraft.com/admin/articles/news/create");
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("article_form_title")));
    driver.findElement(By.id("article_form_status")).click();
    new Select(driver.findElement(By.id("article_form_status"))).selectByValue("1");

    driver.findElement(By.id("article_form_title")).sendKeys(title);

    driver.findElement(By.xpath("//input[@class='dropify dropify-cropper image-element__article_form_smallImage']")).sendKeys(photo.getAbsolutePath());
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("scroll(0,  400)");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.cssSelector("[class=\"btn btn-success\"]")).click();
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("article_form_title")));

    driver.findElement(By.cssSelector("[class=\"dropify dropify-cropper image-element__article_form_bigImage\"]")).sendKeys(photo.getAbsolutePath());
    jse.executeScript("scroll(0,  400)");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    driver.findElement(By.cssSelector("[class=\"btn btn-success\"]")).click();
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("article_form_title")));

    driver.findElement(By.cssSelector("[name=\"save_and_back\"]")).click();
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href=\"/admin/articles/news/create\"]")));
   }
  }
}
