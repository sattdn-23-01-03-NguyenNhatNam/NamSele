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


    public WebElement getEmailField() {
        return Constant.WEBDRIVER.findElement(txtEmail);
    }

    public void enterEmail(String email){
         this.getEmailField().sendKeys(email);
    }

    public WebElement getPasswordField(){
        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    public void enterPassword(String password) {
        this.getPasswordField().sendKeys(password);
    }

    public WebElement getConfirmPWField(){
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }
    public void enterConfirmPassword(String confirmpassword) {
       this.getConfirmPWField().sendKeys(confirmpassword);
    }

    public WebElement getPassportNumberField(){
        return Constant.WEBDRIVER.findElement(txtPassport);
    }
    public void enterPassportnumber(String passportnumber) {
       getPassportNumberField().sendKeys(passportnumber);
    }

    public WebElement getMsgSuccess() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }
    public String showMsgSuccess(){
        return getMsgSuccess().getText();
    }
    public WebElement getRegisterBtn(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }

    public void clickRegister() {
        getRegisterBtn().click();
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
