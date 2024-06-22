package Pages;

import org.openqa.selenium.By;

public class AppiumPage {
    private AppiumPage instance = new AppiumPage();

    public static By ClickViews = By.xpath("//android.widget.TextView[@content-desc='Views']");


    public AppiumPage getInstance() {
        return instance;
    }
}
