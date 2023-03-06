package page;

import org.openqa.selenium.*;

public class RegisterPage {

    public DashboardPage dashboardPage;
    private WebDriver driver;
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");
    private By txtEmail = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By txtPassport = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@type='submit' and @value='Register']");
    private By msgSuccess = By.xpath("//div[@id='content']/p");

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
    public WebElement getMsgSuccess(){
        WebElement successMessage = driver.findElement(msgSuccess);
        successMessage.isDisplayed();
        return successMessage;

    }


    public void clickRegister() {
        WebElement registerClick = driver.findElement(btnRegister);
        registerClick.click();
    }
    public void srollPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
    }



    public void register(String email, String password, String confirmpassword, String passportnumber) throws InterruptedException {
        srollPage();
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
