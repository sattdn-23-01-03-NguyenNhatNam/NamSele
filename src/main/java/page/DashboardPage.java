package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By tabLogin = By.xpath("//a[contains(@href,'Login')]");
    private By tabRegister = By.xpath("//a[contains(@href,'Register')]");


}
