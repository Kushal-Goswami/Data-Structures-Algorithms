package Conditionals.Assignments;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greater");
            } else //c>a
            {
                System.out.println(c + " is greater");
            }
        } else //b>a
        {
            if (b > c) {
                System.out.println(b + " is greater");
            } else //c>b
            {
                System.out.println(c + " is greater");
            }
        }
    }
}
