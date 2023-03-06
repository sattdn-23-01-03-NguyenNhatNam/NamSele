package railway;

import common.constant;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

public class CommonTest {


    @BeforeClass
    void beforeMethod() {
        constant.WEBDRIVER = Driver.setUp();
        constant.WEBDRIVER.get(constant.RAILWAY_URL);
    }

    @AfterClass
    public void afterMethod() {
        constant.WEBDRIVER.quit();
    }

}
