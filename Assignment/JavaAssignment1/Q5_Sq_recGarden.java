/*
5. Square or Rectangle Garden
Scenario: You are designing a small garden. Take its length and breadth as input and check whether it is a
square garden or rectangular.
Input:
Enter length: 12
Enter breadth: 12
Output:
Square garden */

import java.util.Scanner;
public class Q5_Sq_recGarden {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = sc.nextInt();

        if(length == breadth)
        {
            System.out.println("Square garden");
        }
        else
        {
            System.out.println("Rectangular garden");
        }
    }
}
