package acceptance.shald;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {
  public WebDriver driver;
  public WebDriverWait wait;


  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    Dimension d = new Dimension(1400, 800);
    driver.manage().window().setSize(d);
    wait = new WebDriverWait(driver, 10);
    driver.get("https://shield.whileweb.com/ru/index.php?route=product/product&path=86_89&product_id=54");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"pinfo__buy-one-click-button\"]")));

  }

  @AfterClass
  public void close() {
    driver.quit();
  }
}
