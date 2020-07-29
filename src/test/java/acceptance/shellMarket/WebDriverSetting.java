package acceptance.shellMarket;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class WebDriverSetting {
  public WebDriver driver;
  public WebDriverWait wait;

  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    Dimension d = new Dimension(1400, 800);
    driver.manage().window().setSize(d);
    wait = new WebDriverWait(driver, 3);
    driver.get("https://shell-market.test.aurocraft.com/admin/sign-in");
    driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("root");
    driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("111");
    driver.findElement(By.cssSelector("[class=\"btn btn-info btn-lg btn-block text-uppercase waves-effect waves-light\"]")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/admin\"]")));
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  @AfterMethod
  public void failed(ITestResult arg0){
  if (arg0.FAILURE == arg0.getStatus()){
    screenFailure();
  }
  }

  public void screenFailure() {
    long now = System.currentTimeMillis();

    try {
      TakesScreenshot ts = (TakesScreenshot)driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(source, new File("src/test/screenshots/screen" + now + ".png" ));
      System.out.println("The screen is taken");
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
