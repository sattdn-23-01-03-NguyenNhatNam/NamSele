package railway;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.BaseSetUp;
import page.LoginPage;

public class LoginTest extends BaseSetUp {
    private WebDriver driver;
    public LoginPage logInPage;


    @BeforeTest
    public void beforeTest(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.railwayb2.somee.com/");
    }
    @Test
    public void TC(){

        System.out.println("User can login Railway with valid username and password");

    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }


}
