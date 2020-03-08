package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Arrays;

public class TitleVerification3 {

    public static void main(String[] args) throws  Exception {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/", "https://wayfair.com/",
                "https://walmart.com/" , "https://westelm.com/");


        for(String each : urls){
           BrowserFactory.getDriver("chrome");
           WebDriver driver = new ChromeDriver();
           driver.get(each);
           Thread.sleep(2000);
           driver.close();

        }
    }
}
