package acceptance.Ryckov.CreateUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersListPage {
  private WebDriver driver;
  private WebDriverWait wait;

  public UsersListPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  @FindBy(xpath = "//div[@class=\"m-users-list m-view\"]")
  private WebElement userList;

  By formLocator = By.cssSelector("[class='c-text c-text--h1 a-color-dark']");

  public void clickOnCreateUserButton() {
   // userList.findElement(By.cssSelector("[href=\"/uk/users/create\"]")).click();
    driver.findElement(By.cssSelector("[href=\"/uk/users/create\"]")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(formLocator));
  }
}
