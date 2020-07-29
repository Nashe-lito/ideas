package acceptance.ryckov.CreateUser;

import acceptance.ryckov.WebDriverSettings;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class FirstTest extends WebDriverSettings {

  @Test
  public void firstTest() {
    CreateUserPage createUserPage = PageFactory.initElements(driver, CreateUserPage.class);
    MenuNav menuNav = PageFactory.initElements(driver, MenuNav.class);
    CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
    UsersListPage usersListPage = PageFactory.initElements(driver, UsersListPage.class);

    menuNav.clickOnCompanyItem();
    companyPage.clickOnOpenUsersPageButton();
    companyPage.checkUserListPage();
    usersListPage.clickOnCreateUserButton();

    createUserPage.fillFirstName("Test");
    createUserPage.fillSurname("Surname");
    createUserPage.selectRole("admin");

    Random random = new Random();
    int r = random.nextInt(100) + 1;

    String email = "test" + r + "@test.test";
    String userName = "username" + r;

    createUserPage.fillEmail(email);
    createUserPage.fillTel("+380987165555");
    createUserPage.fillUserName(userName);
    createUserPage.fillPassword("12345678");
    createUserPage.fillConfirmPassword("12345678");
    createUserPage.submitForm();
    createUserPage.checkOpenPopUp();
    createUserPage.closePopUp();
    companyPage.checkUserListPage();

    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue(currentUrl.equals("https://shell-b2b.test.aurocraft.com/uk/users"));
  }

  @Test
  public void secondTest() {
    CreateUserPage createUserPage = PageFactory.initElements(driver, CreateUserPage.class);
    MenuNav menuNav = PageFactory.initElements(driver, MenuNav.class);
    CompanyPage companyPage = PageFactory.initElements(driver, CompanyPage.class);
    UsersListPage usersListPage = PageFactory.initElements(driver, UsersListPage.class);

    menuNav.clickOnCompanyItem();
    companyPage.clickOnOpenUsersPageButton();
    usersListPage.clickOnCreateUserButton();

    createUserPage.fillPassword("12345678");
    createUserPage.fillConfirmPassword("12345678");
    createUserPage.submitForm();
    createUserPage.checkCreateUnsuccess();

    String currentUrl = driver.getCurrentUrl();
    Assert.assertTrue(currentUrl.equals("https://shell-b2b.test.aurocraft.com/uk/users/create"));
  }
}
