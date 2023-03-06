package page;

import common.constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private By tabLogin = By.xpath("//a[contains(@href,'Login')]");
    private By txtEmail = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@type='submit']");
    private By msgWelcome = By.xpath("//div[@class='account' and contains(normalize-space(),'Welcome ')]");


    public void openLoginPage(){
        WebElement logintabClick = constant.WEBDRIVER.findElement(tabLogin);
        logintabClick.click();
    }

    public void enterEmail(String email) {
        WebElement emailTxtBox = constant.WEBDRIVER.findElement(txtEmail);
        emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox =constant.WEBDRIVER.findElement(txtPassword);
        passwordTxtBox.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginClick = constant.WEBDRIVER.findElement(btnLogin);
        loginClick.click();
    }

    public WebElement messageWelcome(){
        WebElement welcomeMessage = constant.WEBDRIVER.findElement(msgWelcome);
        return welcomeMessage;
    }
    public String getMessageWelcome(){
        return messageWelcome().getText();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

}
