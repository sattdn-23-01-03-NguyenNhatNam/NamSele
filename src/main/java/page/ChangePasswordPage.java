package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {
    private By txtCurentPassword = By.xpath("//input[@id='currentPassword']");
    private By txtNewPassword = By.xpath("//input[@id='newPassword']");
    private By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private By btnChangePassword = By.xpath("//form[@id='ChangePW']//input[@type='submit']");
    private By msgSuccess = By.xpath("//p[@class='message success']");

    public WebElement getCurrentPasswordField() {
        return Constant.WEBDRIVER.findElement(txtCurentPassword);
    }

    public WebElement getNewPasswordField() {
        return Constant.WEBDRIVER.findElement(txtNewPassword);
    }

    public WebElement getConfirmPasswordField() {
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getBtnChangePassword() {
        return Constant.WEBDRIVER.findElement(btnChangePassword);
    }

    public WebElement getSuccessMsg() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public void enterCurrentPassword(String currentPassword) {
        this.getCurrentPasswordField().sendKeys(currentPassword);
    }

    public void enterNewPassword(String newPassword) {
        this.getNewPasswordField().sendKeys(newPassword);
    }

    public void enterConfirmPassword(String confirmPassword) {
        this.getConfirmPasswordField().sendKeys(confirmPassword);
    }

    public void clickChangePassword() {
        getBtnChangePassword().click();
    }

    public String showSuccessMsg() {
        return getSuccessMsg().getText();
    }

    public void changePassword(String currentPassword, String newPassword, String confirmPassword) {
        enterCurrentPassword(currentPassword);
        enterNewPassword(newPassword);
        enterConfirmPassword(confirmPassword);
        clickChangePassword();
    }

}
