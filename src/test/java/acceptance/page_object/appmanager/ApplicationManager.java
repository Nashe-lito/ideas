package acceptance.page_object.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  protected WebDriver driver;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;

  public StringBuffer verificationErrors = new StringBuffer();
  private String browser;

  public ApplicationManager(String browser){
    this.browser = browser;
  }

  public void init() throws Exception {

    if (browser.equals(BrowserType.CHROME)){
      driver = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)){
      driver = new FirefoxDriver();
    }

    Dimension d = new Dimension(1400, 877);
    driver.manage().window().setSize(d);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    sessionHelper = new SessionHelper(driver);
    navigationHelper = new NavigationHelper(driver);

    sessionHelper.login("johndou", "111");
  }

  public void stop() {
    driver.quit();
  }

  public NavigationHelper getNavigationHelper(){
    return navigationHelper;
  }

  public SessionHelper getSessionHelper(){
    return sessionHelper;
  }
}
