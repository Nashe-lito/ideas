/*
package acceptance.learning_patterns.factory3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class AccountantRole3 implements User3 {
  private WebDriver driver;

*/
/*  public AccountantRole3 (WebDriver driver) {
    this.driver = driver;
  }*//*


  @Override
  public void auth() {
 //  driver = new ChromeDriver();
    String login = "qvasilcuk_1";
    String password = "12345678";

    driver.navigate().to("https://shell-b2b.test.aurocraft.com/admin/sign-in");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys(login);
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.xpath("//*[@id='loginform']/div[4]/div/button")).click();
    assertTrue(driver.findElement(By.xpath("//h4[@class='page-title']")).getText().contains("Dashboard"));
    driver.findElement(By.xpath("//ul[@class='nav navbar-top-links navbar-right pull-right']//a[@class='dropdown-toggle']")).click();
    driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-user']//li//a")).click();
    driver.quit();
  }

}
*/
