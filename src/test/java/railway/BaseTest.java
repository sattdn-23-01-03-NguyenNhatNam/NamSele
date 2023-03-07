package railway;

import common.Constant;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Driver;

public class BaseTest {


    @BeforeClass
    void beforeMethod() {
        Constant.WEBDRIVER = Driver.setUp();
        //constant.WEBDRIVER.get(constant.RAILWAY_URL);
    }

    @AfterClass
    public void afterMethod() {
        Constant.WEBDRIVER.quit();
    }

}
