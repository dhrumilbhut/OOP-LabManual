package com.dhrumil;
import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args) {
        double meter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in meters: ");
        meter=sc.nextDouble();
        double feet = meter * 3.281;
        System.out.println(meter + " meters is " + feet + " feet");
    }
}
