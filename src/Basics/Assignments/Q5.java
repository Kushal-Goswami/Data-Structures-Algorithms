package Basics.Assignments;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        Calculate the area of circle

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle ");
        double r=sc.nextDouble();
        System.out.println();
        System.out.print("Enter the value of pie ");
        double pi=sc.nextDouble();
        System.out.println();
        double A=pi*r*r;
        System.out.println("Area of circle is "+A);


    }
}
