package acceptance.properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionHelperForPropertiesExample extends HelperBaseForPropertiesExample {

  public SessionHelperForPropertiesExample(WebDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {
    driver.get("https://shell-b2b.test.aurocraft.com/uk/auth");
    type(By.xpath("//input[@class='c-input']"), username);
    type(By.xpath("//input[@class='c-password__input']"), password);
    click(By.xpath("//button[@class='c-button c-button--primary']"));

    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='m-layout__sidebar']//div[1]//a[2]//p[1]")));
  }
}
