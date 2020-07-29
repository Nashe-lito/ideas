/*
package acceptance.learning_patterns.factory3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RealAuth3 {
  private WebDriver driver;

  @BeforeMethod
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Dimension d = new Dimension(1400, 877);
    driver.manage().window().setSize(d);
  }


  @Test//(enabled = false)
  public void testAuth() throws Exception {
    driver.get("https://shell-b2b.test.aurocraft.com/uk/auth");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//input[@class='c-input']")).click();
    driver.findElement(By.xpath("//input[@class='c-input']")).clear();
    driver.findElement(By.xpath("//input[@class='c-input']")).sendKeys("johndou");
    driver.findElement(By.xpath("//input[@class='c-password__input']")).click();
    driver.findElement(By.xpath("//input[@class='c-password__input']")).clear();
    driver.findElement(By.xpath("//input[@class='c-password__input']")).sendKeys("111");
    driver.findElement(By.xpath("//button[@class='c-button c-button--primary']")).click();
    driver.findElement(By.xpath("//div[@class='m-navigation__item']")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
}
*/
