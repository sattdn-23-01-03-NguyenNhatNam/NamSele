package page;

import org.openqa.selenium.WebElement;

public class BaseSetUp {
    private WebElement driver;

    public WebElement getDriver() {
        return driver;
    }

    public void setDriver(WebElement driver) {
        this.driver = driver;
    }
}
