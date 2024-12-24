package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (num>9999 && num<100000)
        {
            System.out.println(num+" is a five digit number");
        }
        else
        {
            System.out.println(num+" is not a five digit number");
        }
    }
}
