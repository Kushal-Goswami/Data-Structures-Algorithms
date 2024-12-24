package Loops.HomeWork;

import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        //print 1 to 100

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
