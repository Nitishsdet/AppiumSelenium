package TestClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Set;

public class TestClass {


    @Test
    public void test1 () {

        String arr [] ={"ab", "bb", "aa"};
        //{"bb", "ab", "aa"};

       int lenght = arr.length; // lenght = 3;
        for (int i = 0; i < arr.length ; i++) {
        arr[i].charAt(i);
        }

    }

}
