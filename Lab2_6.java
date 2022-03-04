package com.dhrumil;
import java.util.Scanner;
public class Lab2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in inches : ");
        double height = sc.nextDouble();

        double weightKG= weight * 0.45359237;
        double heightMeter = height * 0.0254;
        double BMI = weightKG/(heightMeter*heightMeter);
        System.out.println(BMI);
    }
}
