package acceptance.ryckov;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {
  public WebDriver driver;
  public WebDriverWait wait;

  @BeforeClass(alwaysRun = true)
  public void setUp() {
    driver = new ChromeDriver();
    Dimension d = new Dimension(1400, 800);
    driver.manage().window().setSize(d);
    wait = new WebDriverWait(driver, 10);

    driver.get("https://shell-b2b.test.aurocraft.com/uk");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"m-sign__form\"]")));
    driver.findElement(By.cssSelector("[class='c-input']")).sendKeys("johndou");
    driver.findElement(By.cssSelector("[class='c-password__input']")).sendKeys("111");
    driver.findElement(By.xpath("//button[@class='c-button c-button--primary']")).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='m-layout__sidebar']//div[1]//a[2]//p[1]")));

    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue(currentUrl.equals("https://shell-b2b.test.aurocraft.com/uk"));
  }

  @AfterClass(alwaysRun = true)
  public void close() {
    driver.quit();
  }

}
