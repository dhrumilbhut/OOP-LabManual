package com.dhrumil;
import java.util.Scanner;
public class Lab2_2 {
    public static void main(String[] args) {
        int r;
        double pi=3.14,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        r=sc.nextInt();
        area=pi*r*r;
        System.out.println(area);

    }
}
