package page;

import common.Constant;
import common.Enums;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {
    private By btnChangePassword = By.xpath("//form[@id='ChangePW']//input[@type='submit']");
    private By msgSuccess = By.xpath("//p[@class='message success']");
    private By lblTitleChangePassword = By.xpath("//div[@id='content']/h1");
    private String txtDynamicLocator = "//input[@id='%s']";

    private By getTxtDynamicLocator(String Name) {
        return By.xpath(String.format(txtDynamicLocator, Name));
    }

    public WebElement getTxtCurrentPassword() {
        return Constant.WEBDRIVER.findElement(getTxtDynamicLocator(Enums.CurrentPassword.getName()));
    }

    public WebElement getTxtNewPassword() {
        return Constant.WEBDRIVER.findElement(getTxtDynamicLocator(Enums.NewPassword.getName()));
    }

    public WebElement getTxtConfirmPassword() {
        return Constant.WEBDRIVER.findElement(getTxtDynamicLocator(Enums.ConfirmPassword.getName()));
    }

    public WebElement getBtnChangePassword() {
        return Constant.WEBDRIVER.findElement(btnChangePassword);
    }

    public WebElement getMsgSuccess() {
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public WebElement getLblTitleChangePassword() {
        return Constant.WEBDRIVER.findElement(lblTitleChangePassword);
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

    public String getTextMsgSuccess() {
        return getMsgSuccess().getText();
    }

    public void changePassword(String currentPassword, String newPassword, String confirmPassword) {
        enterCurrentPassword(currentPassword);
        enterNewPassword(newPassword);
        enterConfirmPassword(confirmPassword);
        clickChangePassword();
    }
}
