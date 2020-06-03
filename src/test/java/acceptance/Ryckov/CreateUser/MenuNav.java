package acceptance.Ryckov.CreateUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuNav {
  private WebDriver driver;
  private WebDriverWait wait;

  public MenuNav(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  public void clickOnCompanyItem() {
    driver.findElement(By.xpath("//div[@class='m-navigation']//div[2]//a[1]")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"c-text c-text--h1 a-color-dark c-page-header__title\"]")));
  }
}
