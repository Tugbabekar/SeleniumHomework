package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String excepted ,String actual){
        if(excepted.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
