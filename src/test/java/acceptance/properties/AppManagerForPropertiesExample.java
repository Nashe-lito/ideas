package acceptance.properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class AppManagerForPropertiesExample {
  private final Properties properties;

    protected WebDriver driver;

    private SessionHelperForPropertiesExample sessionHelperForPropertiesExample;
    private NavigationHelperForPropertiesExample navigationHelperForPropertiesExample;

    public StringBuffer verificationErrors = new StringBuffer();
    private String browser;

    public AppManagerForPropertiesExample(String browser){
    properties = new Properties();
  }

    public void init() throws Exception {
      String target = System.getProperty("target", "local");
      properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
      if (browser.equals(BrowserType.CHROME)){
        driver = new ChromeDriver();
      } else if (browser.equals(BrowserType.FIREFOX)){
        driver = new FirefoxDriver();
      }

      driver.get(properties.getProperty("web.baseUrlPortal"));
      Dimension d = new Dimension(1400, 877);
      driver.manage().window().setSize(d);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

      sessionHelperForPropertiesExample = new SessionHelperForPropertiesExample(driver);
      navigationHelperForPropertiesExample = new NavigationHelperForPropertiesExample(driver);

      sessionHelperForPropertiesExample.login(properties.getProperty("web.testLogin"), properties.getProperty("web.testPassword"));
    }

    public void stop() {
      driver.quit();
    }

    public NavigationHelperForPropertiesExample getNavigationHelperForPropertiesExample(){
      return navigationHelperForPropertiesExample;
    }

    public SessionHelperForPropertiesExample getSessionHelperForPropertiesExample(){
      return sessionHelperForPropertiesExample;
    }
}
