package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (num%5==0||num%3==0)
        {
            System.out.println(num+" is divisible by 5 or 3");
        }
        else
        {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}