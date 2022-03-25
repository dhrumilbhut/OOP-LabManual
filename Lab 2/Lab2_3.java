package com.dhrumil;
import java.util.Scanner;
public class Lab2_3 {
    public static void main(String[] args) {
        int F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit : ");
        F=sc.nextInt();
        float C = (F-32) * (9f/5);
        System.out.println(F+" in Fahrenheit is " + C + " in celsius");

    }
}
