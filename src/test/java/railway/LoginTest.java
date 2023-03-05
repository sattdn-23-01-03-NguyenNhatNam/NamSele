package railway;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.RegisterPage;
import utils.Browser;

public class LoginTest extends Browser {
    private WebDriver driver;
    public LoginPage logInPage;


    @BeforeTest
    public void beforeTest() {
        driver = setUp();
        driver.get("http://railwayb2.somee.com/Account/Login.cshtml");
    }

    @Test
    public void TC() {
        System.out.println("User can login Railway with valid username and password ");
        logInPage = new LoginPage(driver);

        logInPage.login("nhatnam@gmail.com", "12345678");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}
