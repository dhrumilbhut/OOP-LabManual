package com.dhrumil;
import java.util.Scanner;
public class Lab2_4 {
    public static void main(String[] args) {
        int m1,m2,m3,m4,m5,total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 5 subjects : ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();

        total=m1+m2+m3+m4+m5;
        percentage = (total/500f)*100;
        System.out.println("Total = "+total);
        System.out.println("Percentage = "+percentage);
    }
}
