package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private By tabLogin = By.xpath("//a[contains(@href,'Login')]");
    private By txtEmail = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@type='submit']");
    private By msgWelcome = By.xpath("//div[@class='account' and contains(normalize-space(),'Welcome ')]");

    private By msgErrorLoginForm = By.xpath("//p[@class='message error LoginForm']");
    private By msgErrorValidField = By.xpath("//label[@class='validation-error' and @for ='username']");


    public void enterEmail(String email) {
        WebElement emailTxtBox = Constant.WEBDRIVER.findElement(txtEmail);
        emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = Constant.WEBDRIVER.findElement(txtPassword);
        passwordTxtBox.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginClick = Constant.WEBDRIVER.findElement(btnLogin);
        loginClick.click();
    }

    public String getMessageWelcome(){
        return Constant.WEBDRIVER.findElement(msgWelcome).getText();
    }

    public String getMessageErrorLogin(){
        return Constant.WEBDRIVER.findElement(msgErrorLoginForm).getText();
    }

    public String getMessageErrorValid(){
        return Constant.WEBDRIVER.findElement(msgErrorValidField).getText();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

}
