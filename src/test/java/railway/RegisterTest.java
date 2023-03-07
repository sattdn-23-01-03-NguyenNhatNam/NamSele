package railway;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.RegisterPage;

public class RegisterTest extends BaseTest {
    public RegisterPage registerPage = new RegisterPage();
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();

    @Test
    public void TC() throws InterruptedException {
        System.out.println("User can login Railway with registered username and password");
        String email = "nhatnam4@gmail.com";
        String password = "12345678";
        String confirmPassword = password;
        String passportNumber = "123123123";
        homePage.open();
        homePage.clickOnTabRegister();

        registerPage.register(email, password, confirmPassword, passportNumber);
        String actualMsg = registerPage.getMsgSuccess().getText();
        Assert.assertEquals(actualMsg,"You're here","Register failure, Account already exists");

        homePage.clickOnTabLogin();
        loginPage.login(email, password);

    }


}
