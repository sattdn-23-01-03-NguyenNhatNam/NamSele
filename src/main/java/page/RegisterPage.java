package page;

import common.Constant;
import org.openqa.selenium.*;
import utils.Utilities;

public class RegisterPage {
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");
    private By msgSuccess = By.xpath("//div[@id='content']/p");
    private By msgErrorRegister = By.xpath("//p[@class='message error']");
    private By msgErrorConfirmPassword = By.xpath("//label[@class='validation-error' and @for='confirmPassword']");
    private By msgErrorInvalidPassword = By.xpath("//label[@class='validation-error' and @for='password']");
    private By msgErrorInvalidPID = By.xpath("//label[@class='validation-error' and @for='pid']");

    public WebElement getTxtEmail() {
        return Constant.WEBDRIVER.findElement(txtEmail);
    }

    public WebElement getTxtPassword() {
        return Constant.WEBDRIVER.findElement(txtPassword);
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getTxtPassport() {
        return Constant.WEBDRIVER.findElement(txtPassport);
    }

    public WebElement getMsgSuccess() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public WebElement getBtnRegister() {
        return Constant.WEBDRIVER.findElement(btnRegister);
    }

    public WebElement getMsgErrorRegister() {
        return Constant.WEBDRIVER.findElement(msgErrorRegister);
    }

    public WebElement getMsgErrorConfirmPassword() {
        return Constant.WEBDRIVER.findElement(msgErrorConfirmPassword);
    }

    public WebElement getMsgErrorInvalidPassword() {
        return Constant.WEBDRIVER.findElement(msgErrorInvalidPassword);
    }

    public WebElement getMsgErrorInvalidPID() {
        return Constant.WEBDRIVER.findElement(msgErrorInvalidPID);
    }

    public void enterEmail(String email) {
        this.getTxtEmail().sendKeys(email);
    }

    public void enterPassword(String password) {
        this.getTxtPassword().sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
    }

    public void enterPassportNumber(String passportNumber) {
        this.getTxtPassport().sendKeys(passportNumber);
    }

    public String getTextMsgSuccess() {
        return getMsgSuccess().getText();
    }

    public String getTextMsgErrorRegister() {
        return getMsgErrorRegister().getText();
    }

    public String getTextMsgErrorConfirmPassword() {
        return getMsgErrorConfirmPassword().getText();
    }

    public String getTextMsgErrorInValidPassword() {
        return getMsgErrorInvalidPassword().getText();
    }

    public String getTextMsgErrorInValidPID() {
        return getMsgErrorInvalidPID().getText();
    }

    public void clickRegister() {
        getBtnRegister().click();
    }

    public void register(String email, String password, String confirmPassword, String passportNumber) {
        Utilities.scrollToElement(getTxtEmail());
        this.enterEmail(email);
        this.enterPassword(password);
        this.enterConfirmPassword(confirmPassword);
        this.enterPassportNumber(passportNumber);
        clickRegister();
    }
}
