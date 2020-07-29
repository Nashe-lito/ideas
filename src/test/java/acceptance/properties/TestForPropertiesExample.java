package acceptance.properties;

import org.testng.annotations.Test;

public class TestForPropertiesExample extends BaseForTestForPropertiesExample {
    @Test
    public void testForExample() throws Exception {
      appManager.getNavigationHelperForPropertiesExample().openCompanyPage();
    }

}
