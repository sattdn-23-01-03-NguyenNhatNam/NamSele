package railway;

import common.constant;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import utils.Driver;

public class LoginTest extends CommonTest {
    public LoginPage logInPage = new LoginPage();

    @Test
    public void TC01() {
        String email = "nhatnam@gmai.com";
        System.out.println("User can login Railway with valid username and password ");
        logInPage.login(email, "12345678");

        String actual = logInPage.getMessageWelcome();
        String expected = "Welcome "+ email;
        Assert.assertEquals(actual,expected);
    }

//    @Test
//    public void TC02(){
//        System.out.println("");
//    }







}
