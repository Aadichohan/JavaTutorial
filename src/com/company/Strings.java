package com.company;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String  name1 = new String("Ali");
        String  name2 = "Ahmed";
        System.out.println(name1);
        System.out.println(name2);
        //System.out.print(name2);
        int a = 6;
        float b = 4.40f;
       //  Format specifier %d for int , %f for float , %c for char , %s for string
        System.out.printf("The value of A is %d and value of b is %f",a,b);
        System.out.println("");
        System.out.println("Enter Details");
        Scanner sc = new Scanner(System.in);
        String detail = sc.nextLine();
        System.out.println(detail);
    }
}
