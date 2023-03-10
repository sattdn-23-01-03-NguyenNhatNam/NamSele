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

    public WebElement getTxtCurrentPassword() {
        return Constant.WEBDRIVER.findElement(txtCurentPassword);
    }

    public WebElement getTxtNewPassword() {
        return Constant.WEBDRIVER.findElement(txtNewPassword);
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }

    public WebElement getBtnChangePassword() {
        return Constant.WEBDRIVER.findElement(btnChangePassword);
    }

    public WebElement getMsgSuccess() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public void enterCurrentPassword(String currentPassword) {
        this.getTxtCurrentPassword().sendKeys(currentPassword);
    }

    public void enterNewPassword(String newPassword) {
        this.getTxtNewPassword().sendKeys(newPassword);
    }

    public void enterConfirmPassword(String confirmPassword) {
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
    }

    public void clickChangePassword() {
        getBtnChangePassword().click();
    }

    public String showSuccessMsg() {
        return getMsgSuccess().getText();
    }

    public void changePassword(String currentPassword, String newPassword, String confirmPassword) {
        enterCurrentPassword(currentPassword);
        enterNewPassword(newPassword);
        enterConfirmPassword(confirmPassword);
        clickChangePassword();
    }

}
