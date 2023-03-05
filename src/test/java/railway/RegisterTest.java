package railway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegisterPage;
import utils.Browser;

public class RegisterTest extends Browser {
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
        String email = "nhatnam@gmail.com";
        String password = "12345678";
        String confirmpassword = password;
        String passportnumber = "123123123";

        registerPage = new RegisterPage(driver);
        registerPage.register(email, password, confirmpassword, passportnumber);

        loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login(email, password);

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
