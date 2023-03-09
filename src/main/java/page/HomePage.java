package page;

import common.Constant;

public class HomePage extends GeneralPage {
    public HomePage open() {
        Constant.WEBDRIVER.get(Constant.RAILWAY_URL);
        return this;
    }

}

