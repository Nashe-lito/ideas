package acceptance.shellMarket;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Screen {
  public static void main(String[] args) throws Exception{
    WebDriver driver = new ChromeDriver();
    driver.get("https://shell-market.test.aurocraft.com/admin/sign-in");
    TakesScreenshot ts = (TakesScreenshot)driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(source, new File("src/test/screenshots/screen.png"));
    System.out.println("The screen is taken");
    driver.quit();
  }

}
