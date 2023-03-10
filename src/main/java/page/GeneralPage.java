package page;

import common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    private String Login = "Login";
    private String Register = "Register";
    private String BookTicket = "BookTicketPage";
    private String Logout = "Logout";
    private String MyTicket = "ManageTicket";
    private String ChangePassword = "ChangePassword";
    private String tabDynamicLocator = "//a[contains(@href, '<tabname>')]";

    //I haven't applied enums

    private By getTabGeneral(String tabName) {
        return By.xpath(tabDynamicLocator.replace("<tabname>", tabName));
    }

    public WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Login));
    }

    public WebElement getTabRegister() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Register));
    }

    public WebElement getTabBookTicket() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(BookTicket));
    }

    public WebElement getTabLogout() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Logout));
    }

    public WebElement getTabMyTicket() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(MyTicket));
    }

    public WebElement getChangePassword() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(ChangePassword));
    }

    public void clickOnTabRegister() {
        getTabRegister().click();
    }

    public void clickOnTabLogin() {
        getTabLogin().click();
    }

    public void clickOnTabBookTicket() {
        getTabBookTicket().click();
    }

    public void clickOnTabLogout() {
        getTabLogout().click();
    }

    public void clickOnTabChangPassword() {
        getChangePassword().click();
    }

    public void clickOnTabMyTicket() {
        getTabMyTicket().click();
    }
}

