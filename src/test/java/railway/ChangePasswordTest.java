package railway;

import page.ChangePasswordPage;
import page.HomePage;
import page.LoginPage;
import utils.Utilities;

public class ChangePwTest extends BaseTest {
    public HomePage homePage = new HomePage();
    public ChangePasswordPage changePassword = new ChangePasswordPage();
    public LoginPage loginPage = new LoginPage();
    public Utilities utilities = new Utilities();

//    @Test
//    public void TC09() {
//        homePage.open();
//        homePage.clickOnTabLogin();
//        loginPage.login(Constant.Username, Constant.Password);
//        homePage.clickOnTabChangPassword();
//        String newPw = "namdeptrai"+ utilities.randomNumber(1,999)+"a@";
//        System.out.println("newPW:"+newPw);
//        String currentPw = utilities.changeCurrentPw(Constant.Password,newPw);
//        String confirmPw = newPw;
//        changePassword.changePw(currentPw,newPw,confirmPw);
//
//        Assert.assertEquals(changePassword.showSuccessMsg(), "Your password has been updated");
//
//    }
}
