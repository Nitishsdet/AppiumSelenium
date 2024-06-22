package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class test {



        public static void main(String[] args) throws IOException {
          /*  WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));

           */
            String filePath = "/Users/macmillan/Desktop/readFiles.txt";
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("working");
            while ((line= reader.readLine())!=null){
                System.out.println(line);
            }
    }
}
