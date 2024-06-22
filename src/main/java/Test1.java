import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        //  checkEven();
        //  replaceAplhabets();
        solution(10,2);

        int[] inputArray = {1, 2, 3, 4, 5};
        int[] result = solution(inputArray, 3, 0);
        for (int x : result
        ) {
          //  System.out.print(x);
        }

    }

    public static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        //int elemToReplace = 3;
        //  int substitutionElem = 0;
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
                count++;
            }
        }
        return inputArray;
    }

    static void checkEven() {

        //Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.
        String str = "AAA1";
        String regex = "^[a-zA-Z0-9_]+$";
        String reg = "^[0-9]";
        if (str.matches(regex) && !Character.isDigit(str.charAt(0))) {
            System.out.println("Valid");
        } else
            System.out.println("invalid");


    }

    public static void replaceAplhabets() {

        String inputString = "crazy";
        String newstring = "";
        char nextchar;
        char firstcharcter = inputString.charAt(0);
        char nextcharcter = (char) (firstcharcter + 1);

        for (int i = 0; i < inputString.length(); i++) {
            nextchar = (char) ((inputString.charAt(i) + 1) % 26);
            System.out.println(nextchar);
            newstring = newstring + nextchar;
        }
        System.out.println(newstring);

    }

   public static int solution(int n, int firstNumber) {

       return  (firstNumber+n/2)%n;

    }
}







