package acceptance.page_object.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ForExampleTests extends TestBase{

  @Test
  public void testForExample() throws Exception {
    app.getNavigationHelper().openCompanyPage();

/*    assertTrue(app.driver.findElement(By.xpath("//div[@class='c-page-header__actions']//a[@class='c-button c-button--alt']//span[@class='c-button__label']"))
            .getText().contains("Редагування загальної інформації"));*/
  }
}
