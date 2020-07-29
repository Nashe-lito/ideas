package acceptance.shald.Less;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Wd {
  public WebDriver driver;
  public WebDriverWait wait;

  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 5);
    Dimension d = new Dimension(1400, 800);
    driver.manage().window().setSize(d);

    driver.get("https://shield.whileweb.com");
  }

  @AfterClass
  public void tearDown(){
    driver.quit();
  }
}
