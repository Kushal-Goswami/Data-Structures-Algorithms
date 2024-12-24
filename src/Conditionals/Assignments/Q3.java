package Conditionals.Assignments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price: ");
        int sp = sc.nextInt();
        System.out.println();
        System.out.println("Enter the cost price: ");
        int cp = sc.nextInt();

        if (sp > cp) {
            System.out.println("profit");
        } else if (cp > sp) {
            System.out.println("loss");

        } else {
            System.out.println("no profit no loss");
        }

    }
}
