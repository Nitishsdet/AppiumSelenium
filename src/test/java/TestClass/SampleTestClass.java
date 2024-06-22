package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Scanner;

public class SampleTestClass {
      // public WebDriver driver  = new ChromeDriver();

    @Test (priority = 2, invocationCount = 10, enabled = false)
    public static void Test1() {

        System.out.println("P 2 executed");
    }

    @Test (priority = 0, enabled = false)
    public static void Test12() {

       // WebDriver driver = new ChromeDriver();
        System.out.println("P 0 executed");

    }



    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        double readingScore =scan.nextDouble();
        double WritingScrore=scan.nextDouble();
        double listineingScroe=scan.nextDouble();
        double SpeakingScore=scan.nextDouble();
        double Average ;

        Average = (readingScore+WritingScrore+listineingScroe+SpeakingScore ) /4;
        scan.nextLine();
        System.out.println("Your Score is : "+ Average);
        scan.close();








    }
}
