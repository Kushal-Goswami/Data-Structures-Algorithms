package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth ");
        int b = sc.nextInt();
        int A = l * b;
        int P = 2 * (l + b);

        if (A > P) {
            System.out.println("Area is greater than Perimeter");
        }
        if (A < P) {
            System.out.println("Area is less than Perimeter");
        }
        if (A == P) {
            System.out.println("Both are equal");
        }
    }
}
