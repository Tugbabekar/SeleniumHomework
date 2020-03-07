package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Arrays;
public class TitleVerification2 {

    static WebDriver driver;

    public static void main(String[] args)throws Exception {

        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/","https://wayfair.com/",
                "https://walmart.com/" ,"https://westelm.com/");

        driver = BrowserFactory.getDriver("chrome");
        for(String each : urls){
            driver.get(each);
            Thread.sleep(2000);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            String title = driver.getTitle().toLowerCase().replaceAll(" ","");
            if(title.contains(driver.getCurrentUrl())){
                System.out.println("Test Passed: The url is ");
            }else{
                System.out.println("Test Failed");
            }

        }
            driver.quit();
    }
}
