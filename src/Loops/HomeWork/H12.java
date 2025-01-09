package Loops.HomeWork;

import java.util.Scanner;

public class H12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n ");
        int n= sc.nextInt();

        int sum=0;

        while (n!=0)
        {
            int lastDigit=n%10;

            sum+=lastDigit;

            n/=10;
        }

        System.out.println("sum is "+sum);
    }
}
