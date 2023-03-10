package utils;

import common.Constant;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Random;

public class Utilities {
    public static void srollPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
    }

    public static int randomNumber(int min,int max){
        Random random = new Random();
        int value = random.nextInt(max+min)+min;
        return value;
    }
}
