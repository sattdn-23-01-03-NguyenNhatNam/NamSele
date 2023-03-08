package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralPage {
    private String Login = "Login";
    private String Register = "Register";
    private String BookTicket = "BookTicketPage";
    private String Logout = "Logout";
    private String MyTicket = "ManageTicket";
    private String ChangePassWord = "ChangePassword";

    private String tabDynamicLocator = "//a[contains(@href, '<tabname>')]";

    public By getAnotherPage(String tabName) {
        return By.xpath(tabDynamicLocator.replace("<tabname>", tabName));
    }

    public WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(Login));
    }

    public WebElement getTabRegister() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(Register));
    }

    public WebElement getTabBookTicket() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(BookTicket));
    }

    public WebElement getTabLogout() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(Logout));
    }

    public WebElement getTabMyTicket() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(MyTicket));
    }

    public WebElement getChangePassword() {
        return Constant.WEBDRIVER.findElement(getAnotherPage(ChangePassWord));
    }

    public void clickOnTabRegister() {
        this.getTabRegister().click();
    }

    public void clickOnTabLogin() {
        this.getTabLogin().click();
    }

    public void clickOnTabBookTicket() {
        this.getTabBookTicket().click();
    }

    public void clickOnTabLogout() {
        this.getTabLogout().click();
    }

    public void clickOnTabChangPassword() {
        this.getChangePassword().click();
    }
    public void clickOnTagMyTicket(){
        this.getTabMyTicket().click();
    }
}

