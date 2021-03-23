package com.company;

import java.util.Scanner;

public class DisplayMain {

    public static void main(String[] args) {
        int a;
        String message="Enter the number";
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        a=sc.nextInt();
        System.out.println("Value of a="+a);
        System.out.println(a);
    }
}