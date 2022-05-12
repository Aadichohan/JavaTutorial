package com.company;

import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of v");
        int v = sc.nextInt();
        System.out.println("Enter value of u");
        int u = sc.nextInt();
        System.out.println("Enter value of s");
        int s = sc.nextInt();
        int c = (v*v) - (u*u) / 2 * (a*a) * s ;
      //  int c =  2 * a*a * s ;
        //int c = (v*v )-( u*u)  ;
        System.out.println(c);

    }
}
