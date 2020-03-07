package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Arrays;

public class TitleVerification3 {
    static WebDriver driver;
    public static void main(String[] args) throws  Exception {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/", "https://wayfair.com/",
                "https://walmart.com/" , "https://westelm.com/");


        for(String each : urls){
           driver = BrowserFactory.getDriver("chrome");
           driver.get(each);
           Thread.sleep(2000);
           driver.close();

        }
    }
}
