package utils;

import common.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Utilities {
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static int randomNumber(int min, int max) {
        Random random = new Random();
        int value = random.nextInt(max - min) + min;
        return value;
    }
}
