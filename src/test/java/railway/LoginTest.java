package railway;

import common.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.GeneralPage;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends BaseTest {
    public HomePage homePage = new HomePage();
    public LoginPage logInPage = new LoginPage();
    public GeneralPage generalPage = new GeneralPage();

    @Test
    public void TC01() {
        System.out.println("User can login Railway with valid username and password ");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login(Constant.Username, Constant.Password);

        String actual = logInPage.showMessageWelcome();
        String expected = "Welcome " + Constant.Username;
        Assert.assertEquals(actual, expected);

        homePage.clickOnTabLogout();
    }

    @Test
    public void TC02() {
        System.out.println(" User can't login with blank \"Username\" textbox");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login("", Constant.Password);

        Assert.assertEquals(logInPage.getTextMessageErrorLogin(), "There was a problem with your login and/or errors exist in your form.", "The error doesn't display properly");
        Assert.assertEquals(logInPage.getTextMessageErrorValidField(), "You must specify a username.", "The error doesn't display properly");
    }

    @Test
    public void TC03() {
        System.out.println("User cannot log into Railway with invalid password ");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login(Constant.Username, "1231223123");

        Assert.assertEquals(logInPage.getTextMessageErrorLogin(), "There was a problem with your login and/or errors exist in your form.", "The error doesn't display properly");

    }

    @Test
    public void TC04() {

        System.out.println("Login page displays when un-logged User clicks on \"Book ticket\" tab");
        homePage.open();
        homePage.clickOnTabBookTicket();
        String actualURL = Constant.WEBDRIVER.getCurrentUrl();
        String expectedURL = "http://www.railwayb2.somee.com/Account/Login.cshtml?ReturnUrl=/Page/BookTicketPage.cshtml";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void TC05() {
        System.out.println("System shows message when user enters wrong password several times");
        homePage.open();
        homePage.clickOnTabLogin();
        String password = "123123123";

        logInPage.loginWithInvalidAccountSeveralTimes(4, Constant.Username, password);

        String actual = logInPage.getTextMessageErrorLogin();
        String expected = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void TC06() {
        System.out.println("Additional pages display once user logged in");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login(Constant.Username, Constant.Password);
        generalPage.getChangePassword().isDisplayed();
        generalPage.getTabLogout().isDisplayed();
        generalPage.getTabMyTicket().isDisplayed();
        homePage.clickOnTabChangPassword();
    }

    @Test
    public void TC08() {
        System.out.println("User can't login with an account hasn't been activated");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login("namdayne@gmail.com", "123123123");
        Assert.assertEquals(logInPage.getTextMessageErrorLogin(), "Invalid username or password. Please try again.");
    }


}
