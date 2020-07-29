package acceptance.ryckov.CreateUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyPage {
  private WebDriver driver;
  private WebDriverWait wait;

  public CompanyPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  @FindBy(xpath = "//div[@class='m-company-dashboard m-view']")
  private WebElement companyDashboard;

  By createUsersButton = By.cssSelector("[href='/uk/users/create']");

  public void clickOnOpenUsersPageButton() {
    companyDashboard.findElement(By.cssSelector("[href='/uk/users']")).click();

  }

  public void checkUserListPage() {
    wait.until(ExpectedConditions.elementToBeClickable(createUsersButton));
  }
}
