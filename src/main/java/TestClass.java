import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.*;

public class TestClass {


@Test (enabled = false)
    public void TestMethod () {
        String words = "qwe2rty Qwus3tion comp1lete";
      String spilit []=  words.split(" ");
        String temp = "";
        int count = 0;

    for (int i = 0; i < spilit.length ; i++) {
        if (!spilit[i].contains("1") ){
            temp = spilit[i];
            spilit[i]=spilit[i+1];
            spilit[i+1]=temp;
           // i=0;
        }
    }

    for (String ss:spilit
         ) {
        System.out.println(ss);

    }

    }







}














