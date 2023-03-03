package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By txtEmail = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@title='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        WebElement emailTxtBox = driver.findElement(txtEmail);
        emailTxtBox.sendKeys(email);
    }
    public void enterPassword(String password){
        WebElement passwordTxtBox = driver.findElement(txtPassword);
        passwordTxtBox.sendKeys(password);
    }
    public void clickLogin(){
        WebElement loginClick = driver.findElement(btnLogin);
        loginClick.click();
    }
//    public DashboardPage login(String email,String password){
//        enterEmail(email);
//        enterPassword(password);
//        clickLogin();
//        return new DashboardPage(driver);
//    }

}
