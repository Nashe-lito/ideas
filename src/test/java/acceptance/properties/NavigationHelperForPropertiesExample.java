package acceptance.properties;

import org.openqa.selenium.WebDriver;

  public class NavigationHelperForPropertiesExample extends HelperBaseForPropertiesExample{

    public NavigationHelperForPropertiesExample(WebDriver driver) {
      super(driver);
    }

    public void openCompanyPage() {
      driver.navigate().to("https://shell-b2b.test.aurocraft.com/uk/company");
    }
}


