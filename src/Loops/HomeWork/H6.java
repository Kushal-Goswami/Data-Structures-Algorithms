package Loops.HomeWork;

import java.util.Scanner;

public class H6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table of n: ");
        int n = sc.nextInt();
        for (int i = n; i <= 10 * n; i += n) {
            System.out.println(i);
        }
    }
}
