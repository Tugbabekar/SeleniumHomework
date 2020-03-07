package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Arrays;
public class TitleVerification {

    static WebDriver driver;

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        driver = BrowserFactory.getDriver("chrome");
        for( String each : urls){
            driver.get(each);
            Thread.sleep(2000);
            each.equals(driver.getTitle());
            System.out.println("each = " + each);
            Thread.sleep(1000);
            if( each.startsWith("http://practice.cybertekschool.com")){
                System.out.println("TestPassed");
            }else{
                System.out.println("TestFailed");
            }

        }

        driver.quit();
    }
}
