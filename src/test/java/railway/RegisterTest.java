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
    public void TC00() throws InterruptedException {
        System.out.println("User can login Railway with registered username and password");
        String email = "nhatnam6@gmail.com";
        String password = "12345678";
        String confirmPassword = password;
        String passportNumber = "123123123";
        homePage.open();
        homePage.clickOnTabRegister();

        registerPage.register(email, password, confirmPassword, passportNumber);
        String actualMsg = registerPage.showSuccessMsg();
        Assert.assertEquals(actualMsg, "You're here", "Register failure, Account already exists");

        homePage.clickOnTabLogin();
        loginPage.login(email, password);

    }

    @Test
    public void TC07() throws InterruptedException {
        homePage.open();
        homePage.clickOnTabRegister();
        registerPage.register("nam3@gmail.com", "123456789", "123456789", "123123123");
        String actualMsg = registerPage.showSuccessMsg();
        Assert.assertEquals(actualMsg, "Thank you for registering your account", "Register failure, Account already exists");
    }


    @Test
    public void TC10() throws InterruptedException {
        homePage.open();
        homePage.clickOnTabRegister();
        String password = "namquadeptrai";
        String confirmPassword = "namratdeptrai";
        registerPage.register("nam6@gmail.com", password, confirmPassword, "123123123");

        Assert.assertEquals(registerPage.showErrorRegisterMsg(), "There're errors in the form. Please correct the errors and try again.", "The error message doesn't display properly");

        Assert.assertEquals(registerPage.showErrorConfirmPwMsg(), "The two passwords do not match");
    }

    @Test
    public void TC11() throws InterruptedException {
        homePage.open();
        homePage.clickOnTabRegister();
        registerPage.register("nam7@gmail.com", "", "123456789", "");
        Assert.assertEquals(registerPage.showErrorRegisterMsg(), "There're errors in the form. Please correct the errors and try again.", "The error message doesn't display properly");
        Assert.assertEquals(registerPage.showErrorInValidPwMsg(), "Invalid password length.");
        Assert.assertEquals(registerPage.showErrorConfirmPwMsg(), "The two passwords do not match");
        Assert.assertEquals(registerPage.showErrorInValidPIDMsg(), "Invalid ID length.");

    }


}
