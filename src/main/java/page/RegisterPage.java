package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    public DashboardPage dashboardPage;
    private WebDriver driver;
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRegisterPage(){
        WebElement openRegisterPage = driver.findElement(tabRegister);
        openRegisterPage.click();
    }

    public void enterEmail(String email) {
        WebElement emailTxtBox = driver.findElement(txtEmail);
        emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = driver.findElement(txtPassword);
        passwordTxtBox.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmpassword) {
        WebElement confirmpasswordTxtBox = driver.findElement(txtConfirmPassword);
        confirmpasswordTxtBox.sendKeys(confirmpassword);
    }

    public void enterPassportnumber(String passportnumber) {
        WebElement passportnumberTxtBox = driver.findElement(txtPassport);
        passportnumberTxtBox.sendKeys(passportnumber);
    }


    public void clickRegister() {
        WebElement registerClick = driver.findElement(btnRegister);
        registerClick.click();
    }

    public void register(String email, String password, String confirmpassword, String passportnumber) throws InterruptedException {
        enterEmail(email);
        Thread.sleep(2000);
        enterPassword(password);
        Thread.sleep(2000);
        enterConfirmPassword(confirmpassword);
        Thread.sleep(2000);
        enterPassportnumber(passportnumber);
        Thread.sleep(2000);
        clickRegister();

    }




}
