package TestClass;

import ExecutionEngine.BaseTest;
import Pages.AppiumPage;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.IdentityHashMap;

public class AppiumTest extends BaseTest {


    @Test (enabled = false)

    public  void runApp () throws InterruptedException {
        System.out.println("horray!!");

       String text = driver.findElement(By.xpath("//android.widget.TextView[8]")).getText();
        Assert.assertEquals(text,"Drag and Drop");
        System.out.println(text);


    }
    @Test (enabled = false)
    public void scroll () {
        Dimension dimension = driver.manage().window().getSize();
        Double screenheightStart = dimension.getHeight()*0.85;
        int scrollStart = screenheightStart.intValue();
        Double screenHeightEnd = dimension.getHeight()*0.15;
        int scrollEnd = screenHeightEnd.intValue();
        driver.findElement(By.xpath("//android.widget.TextView[12]")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector()" +
                ".text(\"Tabs\"))"));
    }
    @Test (enabled = false)
    public void SwipeImage () throws InterruptedException {
        driver.findElement(AppiumPage.ClickViews).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Gallery']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();
     //   driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
       WebElement firstImage=  driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
        swipe(firstImage,"left");

    }
                    @Test(enabled = true)
                public void DragandDropTest() throws InterruptedException {

                        driver.findElement(AppiumPage.ClickViews).click();
                    driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
                   WebElement element= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
                        DragnDrop(element,619,560);
                    Thread.sleep(4000);

                }





}
