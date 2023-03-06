package railway;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegisterPage;
import utils.Driver;

public class RegisterTest extends Driver {
    private WebDriver driver;
    public RegisterPage registerPage;
    public LoginPage loginPage;

    @BeforeTest
    public void beforeTest() {
        driver = setUp();
        driver.get("http://railwayb2.somee.com/Account/Register.cshtml");
    }

    @Test
    public void TC() throws InterruptedException {
        System.out.println("User can login Railway with registered username and password");
        String email = "nhatnam123@gmail.com";
        String password = "12345678";
        String confirmpassword = password;
        String passportnumber = "123123123";



        registerPage = new RegisterPage(driver);
        registerPage.register(email, password, confirmpassword, passportnumber);

        String actualMsg = registerPage.getMsgSuccess().getText();
        Assert.assertEquals(actualMsg,"You're here");


        loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(email, password);

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
