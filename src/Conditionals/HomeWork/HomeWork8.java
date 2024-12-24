package Conditionals.HomeWork;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {

        //Determine who is youngest among three
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Ram's age : ");
        int ram = sc.nextInt();
        System.out.print("Enter the Shyam's age : ");
        int shyam = sc.nextInt();
        System.out.print("Enter the Ajay's age : ");
        int ajay = sc.nextInt();

        if (ram <= shyam) {
            if (ram <= ajay) {
                System.out.println(ram + " ram is youngest");
            } else //ajay<ram<shyam
            {
                System.out.println(ajay + " ajay is youngest");
            }
        } else //shyam<ram
        {
            if (shyam <= ajay) {
                System.out.println(shyam + " shyam is youngest");
            } else //ajay<shyam<ram
            {
                System.out.println(ajay + " ajay is youngest");
            }
        }

    }
}
