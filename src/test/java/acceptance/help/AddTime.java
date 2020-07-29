package acceptance.help;

import org.testng.annotations.Test;

public class AddTime {
  @Test
  public void test() {
      long now = System.currentTimeMillis();
      String login = String.format("user%s", now);
      String email = String.format("mod%s@test.test", now);
  }
}
