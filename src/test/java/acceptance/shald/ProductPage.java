package acceptance.shald;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
  private WebDriver driver;
  private WebDriverWait wait;

  public ProductPage (WebDriver driver){
    this.driver = driver;
    wait = new WebDriverWait(driver, 5);
  }

  @FindBy (css="[data-target=\"#one-click-buy-modal\"]")
  private WebElement oneClickBuyButton1;

  @FindBy (id ="name54")
  private WebElement nameField;

  @FindBy(id = "phone54")
  private WebElement phoneField;

  @FindBy(css = "[class=\"btn w50  mr-2\"]")
  private WebElement buyButton;

  @FindBy(css = "[class=\"btn w300 mt-5\"]")
          private WebElement toGoButton;

  By modalTitle = By.cssSelector("[class=\"cart-product__title\"]");
  By successForm = By.cssSelector("[class=\"btn w300 mt-5\"]");
  By byuOneClickButton = By.cssSelector("[class=\"pinfo__buy-one-click-button\"]");

  public void openModalOneClickBuy() {
    oneClickBuyButton1.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(modalTitle));
  }

  public void fillName(String userName) {
    nameField.sendKeys(userName);
  }

  public void fillPhone(String tel) {
    phoneField.sendKeys(tel);
  }

  public void clickBuyButton() {
    buyButton.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(successForm));
  }

  public void clickToGoButton() {
    toGoButton.click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(byuOneClickButton));
  }


}
