package acceptance.page_object.tests;

import org.testng.annotations.Test;

public class ForExampleTests extends TestBase{

  @Test
  public void testForExample() throws Exception {
    app.getNavigationHelper().openCompanyPage();
  }
}
