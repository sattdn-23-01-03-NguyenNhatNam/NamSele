package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    private WebDriver driver;
    private By tabLogin = By.xpath("//a[contains(@href,'Login')]");
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");

    public WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }
    public WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }


    public void clickOnTabRegister(){
        this.getTabRegister().click();
    }
    public void clickOnTabLogin(){
        this.getTabLogin().click();
    }
}
