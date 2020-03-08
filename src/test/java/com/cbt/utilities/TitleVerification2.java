package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Arrays;
public class TitleVerification2 {


    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com","https://wayfair.com",
                "https://walmart.com" ,"https://www.westelm.com");

       BrowserFactory.getDriver("chrome");
       WebDriver driver = new ChromeDriver();

        for(String url : urls){
            driver.get(url);
          //  System.out.println(driver.getTitle());
            String title = driver.getTitle().toLowerCase().replaceAll(" ","");
                if (url.contains(title)) {
                    System.out.println("Test Passed");
                } else {
                    System.out.println("Test Failed");
                }
            }

            driver.quit();
    }
}
