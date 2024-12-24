package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a + " is the smallest number");
        } else if (b <= c && b <= a) {
            System.out.println(b + " is the smallest number");

        } else {
            System.out.println(c + " is the smallest number");
        }
    }
}
