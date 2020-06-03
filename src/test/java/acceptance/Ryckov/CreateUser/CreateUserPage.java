package acceptance.Ryckov.CreateUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserPage {
  private  WebDriver driver;
  private WebDriverWait wait;


  public CreateUserPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div[1]/label/input")
  private WebElement firstName;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/label/input")
  private WebElement surName;

  @FindBy(xpath = "//div[@id='root']/div/div[3]/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/label/span[2]/select")
  private WebElement selectRole;

  @FindBy(css = "[type='email']")
  private WebElement email;

  @FindBy(css = "[type='tel']")
  private WebElement tel;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div/div[4]/div[1]/label/input")
  private WebElement user;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div/div[5]/div[1]/label/div/input")
  private WebElement password;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div[2]/div/div/div[1]/div/div[5]/div[2]/label/div/input")
  private WebElement passwordConfirm;

  @FindBy(css = "[class='c-button c-button--primary']")
  private WebElement saveButton;

  @FindBy(css = "[class='c-popup__actions']")
  private WebElement popUp;


  By createPageTitle = By.cssSelector("[class='c-text c-text--h1 a-color-dark']");
  By openPopUp = By.xpath("//*[@id=\"overlay-root\"]/div/div[4]/div/div/div[2]/div/div");
  By okButton = By.cssSelector("[class='c-button c-button--primary']");

  public void openUserCreatePage() {
    driver.get("https://shell-b2b.test.aurocraft.com/uk/users/create");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='c-text c-text--h1 a-color-dark']")));
  }

  public void fillFirstName(String nameFirst) {
    firstName.sendKeys(nameFirst);
  }

  public void fillSurname(String nameSur) {
    surName.sendKeys(nameSur);
  }

  public void selectRole(String role) {
    selectRole.click();
    new Select(selectRole).selectByValue(role);
  };

  public void fillEmail(String emailText) {
    email.sendKeys(emailText);
  }

  public void fillTel(String telephoneNumber) {
    tel.sendKeys(telephoneNumber);
  }

  public void fillUserName(String userName) {
    user.sendKeys(userName);
  }

  public void fillPassword(String pass) {
    password.sendKeys(pass);
  }

  public void fillConfirmPassword(String pass) {
    passwordConfirm.sendKeys(pass);
  }

  public void submitForm() {
    wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
  }

  public void checkCreateUnsuccess() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(createPageTitle));
  }

  public void checkOpenPopUp() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(openPopUp));
  }

  public void closePopUp() {
    popUp.findElement(okButton).click();
  }
}
