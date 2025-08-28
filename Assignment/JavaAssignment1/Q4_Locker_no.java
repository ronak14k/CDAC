/* 4. Even or Odd Locker Number
Scenario: Your school assigns lockers with numbers. Take locker number as input and print whether it is
even or odd.
Input:
Enter locker number: 17
Output:
Odd locker number*/

import java.util.Scanner;
public class Q4_Locker_no {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter locker number: ");
        int lockerNumber = sc.nextInt();

        if(lockerNumber % 2 == 0)
        {
            System.out.println("Even locker number");
        }
        else
        {
            System.out.println("Odd locker number");
        }
    }
}
