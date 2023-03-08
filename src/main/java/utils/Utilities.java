package utils;

import common.Constant;
import org.openqa.selenium.JavascriptExecutor;

public class Utilities {
    public void srollPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
    }
}
