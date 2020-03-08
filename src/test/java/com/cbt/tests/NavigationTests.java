package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
1-Create class NavigationTests under tests package.
2-Automate the provided test case   using 3 different browsers.
3-Create a separate test method for   each   browser
4-if y ou are using Mac OS, create test    methods for   Chrome, Firefox,Safari.
5-Each test    should close the   browser after completion.
6-Test    methods must use    the   utilities
7-Run    all   three test methods from the main method.
Test Case
1. Open browser
2.Go to website https://google.com
3. Save the title in a string variable
4. Go to https://etsy.com
5. Save the title in a string variable
6. Navigate back to previous page
7. Verify that title is same is in step 3
8. Navigate forward to previous page
9. Verify that title is same is in step 5
 */
public class NavigationTests {

    public static void main(String[] args) {

        testChrome();
        testFirefox();
        testSafari();

    }

    public static void testChrome() {


      BrowserFactory.getDriver("chrome");
      WebDriver driver =new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 =driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        // driver.close();
        driver.quit();


    }
    public static void testFirefox(){

        BrowserFactory.getDriver("firefox");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 =driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
       // driver.close();
        driver.quit();

    }

    public static void testSafari(){

       BrowserFactory.getDriver("safari");
       WebDriver driver =new SafariDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 =driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
       // driver.close();
        driver.quit();

    }
}
