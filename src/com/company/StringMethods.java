package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        StringMethods stm = new StringMethods();
        String name = "Hassan";
//        to get length
        System.out.println(name.length());
        // toLowerCase
        String lString = name.toLowerCase();
        System.out.println(lString);
        // toUpperCase
        String UString = name.toUpperCase();
        System.out.println(UString);

        // trim remove spaces from start and end
        String nonTrim = "  Your name is Ali";
        String nts =  nonTrim.trim();
        System.out.println(nts);

        // subString
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));

        // charAt
        System.out.println("charAt");
        System.out.println(name.charAt(1));

        // Recursive with loop recursion
        System.out.println("Recursive with loop recursion");
        System.out.println(stm.recursive(5, name));

        // Recursion with substring, charAt
        System.out.println("Recursion with substring, charAt");
        System.out.println(stm.replace(name));
    }

    public String recursive(int a, String str){
        char strArr [] = str.toCharArray();
       if(a == 0){
           return String.valueOf(strArr[a]);
       }
       return String.valueOf(strArr[a])+ recursive( a - 1, str);
    }

    public String replace(String str){

        if(str.isEmpty()){
            return str;
        }
        return replace(str.substring(1)) + str.charAt(0);
    }
}
