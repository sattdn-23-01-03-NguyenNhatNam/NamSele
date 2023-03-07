package railway;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends BaseTest {
    public HomePage homePage = new HomePage();
    public LoginPage logInPage = new LoginPage();

    @Test
    public void TC01() {
        System.out.println("User can login Railway with valid username and password ");
        homePage.open();
        homePage.clickOnTabLogin();
        String email = "nhatnam@gmai.com";
        logInPage.login(email, "12345678");

        String actual = logInPage.getMessageWelcome();
        String expected = "Welcome "+ email;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void TC02(){
        System.out.println(" User can't login with blank \"Username\" textbox");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login("","123456789");

        Assert.assertEquals(logInPage.getMessageErrorLogin(),"There was a problem with your login and/or errors exist in your form.","The error doesn't display properly");
        Assert.assertEquals(logInPage.getMessageErrorValid(),"You must specify a username.","The error doesn't display properly");
    }

    @Test
    public void TC03(){
        System.out.println("User cannot log into Railway with invalid password ");
        homePage.open();
        homePage.clickOnTabLogin();
        logInPage.login("nhatnam@gmai.com","1231223123");

        Assert.assertEquals(logInPage.getMessageErrorLogin(),"There was a problem with your login and/or errors exist in your form.","The error doesn't display properly");

    }







}