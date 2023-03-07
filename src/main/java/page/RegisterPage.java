package page;

import common.Constant;
import org.openqa.selenium.*;

public class RegisterPage {

    public GeneralPage dashboardPage;
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");
    private By msgSuccess = By.xpath("//div[@id='content']/p");


    public void enterEmail(String email) {
        WebElement emailTxtBox = Constant.WEBDRIVER.findElement(txtEmail);
        emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = Constant.WEBDRIVER.findElement(txtPassword);
        passwordTxtBox.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        WebElement confirmpasswordTxtBox = Constant.WEBDRIVER.findElement(txtConfirmPassword);
        confirmpasswordTxtBox.sendKeys(confirmpassword);
    }

    public void enterPassportnumber(String passportnumber) {
        WebElement passportnumberTxtBox = Constant.WEBDRIVER.findElement(txtPassport);
        passportnumberTxtBox.sendKeys(passportnumber);
    }
    public WebElement getMsgSuccess(){
        WebElement successMessage = Constant.WEBDRIVER.findElement(msgSuccess);
        successMessage.isDisplayed();
        return successMessage;

    }


    public void clickRegister() {
        WebElement registerClick = Constant.WEBDRIVER.findElement(btnRegister);
        registerClick.click();
    }
    public void srollPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
    }

    public void register(String email, String password, String confirmPassword, String passportNumber) throws InterruptedException {
        srollPage();
        enterEmail(email);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        enterPassportnumber(passportNumber);
        clickRegister();

    }




}
