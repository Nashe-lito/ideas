/*
package acceptance.learning_patterns.factory2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class AuthorisationFactoryPattern2 {
*/
/*   public static Authorisation login(String role, String login, String password){
     if ("admin".equalsIgnoreCase(role))
       return new AdminRole(login, password);
     else if ("accountant".equalsIgnoreCase(role))
       return new AccountantRole(login, password);

     return null;
   }*//*


  public WebDriver driver;
  @Test
  public void authorization(String login, String password) {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Dimension d = new Dimension(1400, 877);
    driver.manage().window().setSize(d);

    driver.navigate().to("https://shell-b2b.test.aurocraft.com/admin/sign-in");
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys(login);
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.xpath("//*[@id='loginform']/div[4]/div/button")).click();
    assertTrue(driver.findElement(By.xpath("//h4[@class='page-title']")).getText().contains("Dashboard"));
  }
}
*/
