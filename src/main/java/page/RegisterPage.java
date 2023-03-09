package page;

import common.Constant;
import org.openqa.selenium.*;
import utils.Utilities;

public class RegisterPage {

    public Utilities utilities = new Utilities();
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");
    private By msgSuccess = By.xpath("//div[@id='content']/p");
    private By msgErrorRegister = By.xpath("//p[@class='message error']");
    private By msgErrorConfirmPw = By.xpath("//label[@class='validation-error' and @for='confirmPassword']");
    private By msgErrorInvalidPw = By.xpath("//label[@class='validation-error' and @for='password']");
    private By msgErrorInvalidPID = By.xpath("Invalid ID length.");

    public WebElement getEmailField() {
        return Constant.WEBDRIVER.findElement(txtEmail);
    }

    public WebElement getPasswordField() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    public WebElement getConfirmPWField() {
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getPassportNumberField() {
        return Constant.WEBDRIVER.findElement(txtPassport);
    }

    public WebElement getSuccessMsg() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public WebElement getRegisterBtn() {
        return Constant.WEBDRIVER.findElement(btnRegister);
    }

    public WebElement getErrorRegisterMsg() {
        return Constant.WEBDRIVER.findElement(msgErrorRegister);
    }

    public WebElement getErrorConfirmPwMsg() {
        return Constant.WEBDRIVER.findElement(msgErrorConfirmPw);
    }

    public WebElement getErrorInvalidPwMsg() {
        return Constant.WEBDRIVER.findElement(msgErrorInvalidPw);
    }

    public WebElement getErrorInvalidPIDMsg() {
        return Constant.WEBDRIVER.findElement(msgErrorInvalidPID);
    }


    public void enterEmail(String email) {
        this.getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        this.getPasswordField().sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        this.getConfirmPWField().sendKeys(confirmpassword);
    }

    public void enterPassportnumber(String passportnumber) {
        this.getPassportNumberField().sendKeys(passportnumber);
    }

    public String showSuccessMsg() {
        return getSuccessMsg().getText();
    }

    public String showErrorRegisterMsg() {
        return getErrorRegisterMsg().getText();
    }

    public String showErrorConfirmPwMsg() {
        return getErrorConfirmPwMsg().getText();
    }

    public String showErrorInValidPwMsg() {
        return getErrorInvalidPwMsg().getText();
    }

    public String showErrorInValidPIDMsg() {
        return getErrorInvalidPIDMsg().getText();
    }

    public void clickRegister() {
        getRegisterBtn().click();
    }

    public void register(String email, String password, String confirmPassword, String passportNumber) throws InterruptedException {
        utilities.srollPage();
        this.enterEmail(email);
        this.enterPassword(password);
        this.enterConfirmPassword(confirmPassword);
        this.enterPassportnumber(passportNumber);
        clickRegister();

    }
}

