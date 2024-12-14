package Basics.Homework;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=scan.nextDouble();
        System.out.println("Enter the value of pi");
        double pi=scan.nextDouble();
        double v=(4*pi*r*r*r)/3;
        System.out.println("Area of sphere is "+v);

    }




}
