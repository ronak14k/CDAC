/*6. Leap Year Check for a Birthday
Scenario: You want to celebrate your friend’s birthday on Feb 29 if it’s a leap year. Take the year as input
and check if it’s a leap year.
Input:
Enter year: 2024
Output:
2024 is a leap year. */

import java.util.Scanner;
public class Q6_leapyearcheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
