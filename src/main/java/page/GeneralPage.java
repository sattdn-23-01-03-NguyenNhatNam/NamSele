package page;

import common.Constant;
import common.Enums;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class GeneralPage {
    private String tabDynamicLocator = "//a[contains(@href, '%s')]";

    private By getTabGeneral(String tabName) {
        return By.xpath(String.format(tabDynamicLocator, tabName));
    }

    public WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.Login.getName()));
    }

    public WebElement getTabRegister() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.Register.getName()));
    }

    public WebElement getTabBookTicket() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.BookTicketPage.getName()));
    }

    public WebElement getTabLogout() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.Logout.getName()));
    }

    public WebElement getTabMyTicket() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.ManageTicket.getName()));
    }

    public WebElement getChangePassword() {
        return Constant.WEBDRIVER.findElement(getTabGeneral(Enums.ChangePassword.getName()));
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
}
