package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private By txtEmail = By.xpath("//input[@id='username']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@type='submit']");
    private By msgWelcome = By.xpath("//div[@class='account' and contains(normalize-space(),'Welcome ')]");
    private By msgErrorLoginForm = By.xpath("//p[@class='message error LoginForm']");
    private By msgErrorValidField = By.xpath("//label[@class='validation-error' and @for ='username']");

    public WebElement getEmailField() {
        return Constant.WEBDRIVER.findElement(txtEmail);
    }
    public void enterEmail(String email){
        getEmailField().sendKeys(email);
    }

    public WebElement getPasswordField(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    public void enterPassword(String password) {
       getPasswordField().sendKeys(password);
    }
    public WebElement getBtnLogin(){
        return Constant.WEBDRIVER.findElement(btnLogin);
    }

    public void clickLogin() {
       getBtnLogin().click();
    }

    public WebElement getWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(msgWelcome);
    }
    public String showWelcomeMessage(){
        return getWelcomeMessage().getText();
    }

    public WebElement getErrorLoginMessage(){
        return Constant.WEBDRIVER.findElement(msgErrorLoginForm);
    }
    public String showErrorLoginMessage(){
        return getErrorLoginMessage().getText();
    }

    public WebElement getErrorSpecifyMessage(){
        return Constant.WEBDRIVER.findElement(msgErrorValidField);
    }

    public String showErrorValidMessage(){
        return getErrorSpecifyMessage().getText();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }

}
