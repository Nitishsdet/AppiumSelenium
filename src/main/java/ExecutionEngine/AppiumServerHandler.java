package ExecutionEngine;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class AppiumServerHandler {

    public synchronized  static AppiumDriver LaunchServer () {
       // DesiredCapabilities caps = new DesiredCapabilities();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("dd7b1fbc");
        options.setPlatformVersion("11");
        options.setAppActivity( "com.oneplus.calculator.Calculator");
        options.setAppPackage("com.oneplus.calculator");
        options.setCapability("uiautomator2ServerLaunchTimeout", 60000);
        options.setNoReset(true);
        HashMap<String,String> environment = new HashMap<>();
        environment.put("ANDROID_HOME","/Users/macmillan/Library/Android/sdk");
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1").usingAnyFreePort().withEnvironment(environment).
                usingDriverExecutable(new File("/usr/local/bin/node")).
                withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).
        withCapabilities(options);
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Appium Server has started on URL" + service.getUrl());
        System.out.println(service.isRunning());
        AppiumDriver driver = new AndroidDriver(service.getUrl(),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        return driver;

    }

    public static void StopAppiumServer () {

        String[] command = { "/usr/bin/killall", "-KILL", "node" };
        try {
            Runtime.getRuntime().exec(command);
            System.out.println("Appium server stopped.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        StopAppiumServer();
    }

}
