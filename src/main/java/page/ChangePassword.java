package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePassword {
    private By txtCurentPw = By.xpath("//input[@id='currentPassword']");
    private By txtNewPw = By.xpath("//input[@id='newPassword']");
    private By txtConfirmPw = By.xpath("//input[@id='confirmPassword']");
    private By btnChangePw = By.xpath("//form[@id='ChangePW']//input[@type='submit']");
    private By msgSuccess = By.xpath("//p[@class='message success']");

    public WebElement getCurrentPwField() {
        return Constant.WEBDRIVER.findElement(txtCurentPw);
    }

    public WebElement getNewPwField() {
        return Constant.WEBDRIVER.findElement(txtNewPw);
    }
    public WebElement getConfirmPwField(){
        return Constant.WEBDRIVER.findElement(txtConfirmPw);
    }
    public WebElement getBtnChangePw(){
        return Constant.WEBDRIVER.findElement(btnChangePw);
    }
    public WebElement getSuccessMsg(){
        return Constant.WEBDRIVER.findElement(msgSuccess);
    }

    public void enterCurrentPW(String currentPW){
        getCurrentPwField().sendKeys(currentPW);
    }
    public void enterNewPW(String newPW){
        getNewPwField().sendKeys(newPW);
    }
    public void enterConfirmPW(String confirmPW){
        getConfirmPwField().sendKeys(confirmPW);
    }
    public void clickChangePw(){
        getBtnChangePw().click();
    }
    public String showSuccessMsg(){
        return getSuccessMsg().getText();
    }

    public void changePw(String currentPw,String newPw,String confirmPw){
        enterCurrentPW(currentPw);
        enterNewPW(newPw);
        enterConfirmPW(confirmPw);
        clickChangePw();
    }

}
