package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Yes, the number is divisible by 5");
        } else {
            System.out.println("No, it is not divisible by 5");
        }
    }
}
