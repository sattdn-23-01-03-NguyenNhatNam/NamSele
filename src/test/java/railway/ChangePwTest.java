package railway;

import common.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ChangePassword;
import page.HomePage;
import page.LoginPage;

public class ChangePwTest extends BaseTest{
    public HomePage homePage = new HomePage();
    public ChangePassword changePassword = new ChangePassword();
    public LoginPage loginPage = new LoginPage();

    @Test
    public void TC09(){
        homePage.open();
        homePage.clickOnTabLogin();
        loginPage.login(Constant.Username,Constant.Password);
        homePage.clickOnTabChangPassword();
        changePassword.changePw(Constant.Password,"123456789","123456789");

        Assert.assertEquals(changePassword.showSuccessMsg(),"Your password has been updated");

    }
}
