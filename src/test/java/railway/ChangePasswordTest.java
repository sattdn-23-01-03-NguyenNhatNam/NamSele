package railway;

import common.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ChangePasswordPage;
import page.HomePage;
import page.LoginPage;
import utils.Utilities;

public class ChangePasswordTest extends BaseTest {
    public HomePage homePage = new HomePage();
    public ChangePasswordPage changePassword = new ChangePasswordPage();
    public LoginPage loginPage = new LoginPage();

    @Test
    public void TC09() {
        homePage.open();
        homePage.clickOnTabLogin();
        loginPage.login(Constant.Username, Constant.Password);
        homePage.clickOnTabChangPassword();
        changePassword.changePassword(Constant.Password, "12345678", "12345678");
        Assert.assertEquals(changePassword.showSuccessMsg(), "Your password has been updated");

    }
}
