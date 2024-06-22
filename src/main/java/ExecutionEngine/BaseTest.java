package ExecutionEngine;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
            public void ConfigureAppium () throws MalformedURLException {
                HashMap<String,String> environment = new HashMap<>();
                environment.put("ANDROID_HOME","/Users/macmillan/Library/Android/sdk");
                 service = new AppiumServiceBuilder(). withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                        .usingPort(4723).withEnvironment(environment).build();
               service.start();
                UiAutomator2Options options = new UiAutomator2Options();
                options.setDeviceName("dd7b1fbc");
                options.setAppActivity( "io.appium.android.apis.ApiDemos");
                options.setAppPackage("io.appium.android.apis");
                options.setCapability("uiautomator2ServerLaunchTimeout", 6000);


                driver = new AndroidDriver(service.getUrl(),options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


            }
           @AfterClass
           public void teardown() {
            driver.quit();
            service.stop();
            }

            public void LongPress (WebElement element) {
                ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
                        ImmutableMap.of("elementId",((RemoteWebElement)element).getId()
                        ,"duration",2000));
            }

            public void ScrollToEnd (String direction, double percent) {
                boolean canScrollMore;
                do {
                    canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                            "left", 100, "top", 100, "width", 200, "height", 200,
                            "direction", direction,
                            "percent", percent
                    ));
                } while (canScrollMore);
    }

            public  void swipe (WebElement element, String direction){
                ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture",
                        ImmutableMap.of("elementId",((RemoteWebElement)element).getId()
                                ,"direction",direction,"percent",0.75));
            }
    public void DragnDrop(WebElement element, int endX, int endY) {


        ((JavascriptExecutor) driver).executeScript("mobile:dragGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),
                "endX", endX, "endY", endY));


    }
}
