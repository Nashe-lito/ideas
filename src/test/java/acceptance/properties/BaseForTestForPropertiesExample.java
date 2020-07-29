package acceptance.properties;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseForTestForPropertiesExample {
  public final AppManagerForPropertiesExample appManager = new AppManagerForPropertiesExample(BrowserType.CHROME);

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    appManager.init();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    appManager.stop();
  }

  public AppManagerForPropertiesExample getAppManager() {
    return appManager;
  }
}
