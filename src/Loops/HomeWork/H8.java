package Loops.HomeWork;

import java.util.Scanner;

public class H8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n ");
        int n= sc.nextInt();
//        int a=2;
//        int d=3;
//        for (int i=1; i<=n;i++)
//        {
//            System.out.println(a);
//            a+=d;
//        }

        // 5,1,-3,-11, -15
        int a=5;
        int d=-4;
        for (int i=1; i<=n; i++)
        {
            System.out.println(a);
            a+=d;

        }
    }
}
