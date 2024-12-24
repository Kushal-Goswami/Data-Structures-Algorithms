package Conditionals;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x coordinate : ");
        int x = sc.nextInt();
        System.out.print("Enter the y coordinate : ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point lies at Origin");
        } else if (x > 0 && y > 0) {
            System.out.println("Point lies at 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies at 2nd quadrant");

        } else if (x < 0 && y < 0) {
            System.out.println("Point lies at 3rd quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies at 4th quadrant");

        } else if (x == 0) {
            System.out.println("Point lies at x axis");
        } else if (y == 0) {
            System.out.println("Point lies at y axis");
        }
    }
}
