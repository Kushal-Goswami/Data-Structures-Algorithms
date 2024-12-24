package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        //Absolute value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(-num);
        } else {
            System.out.println(num);
        }

    }
}
