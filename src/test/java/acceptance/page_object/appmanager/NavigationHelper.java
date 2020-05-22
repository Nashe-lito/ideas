package acceptance.page_object.appmanager;

import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
//  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void openCompanyPage() {
    driver.navigate().to("https://shell-b2b.test.aurocraft.com/uk/company");
  }
}
