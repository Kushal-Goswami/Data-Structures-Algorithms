package Conditionals.Assignments;

import java.util.Scanner;

class Absolute
{
    public void display()
    {
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=ac.nextInt();
        if (a<0)
        {
            System.out.println(-a);
        }
        else
        {
            System.out.println(a);
        }
    }
}
public class Q2 {
    public static void main(String[] args) {

        Absolute abs=new Absolute();
        abs.display();
    }
}
