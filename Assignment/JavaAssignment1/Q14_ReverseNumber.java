/* 14. Reverse a 4-Digit Number
Scenario: Take a 4-digit number and print its reverse.
Input:
Enter 4-digit number: 1234
Output:
Reversed number: 4321 */

import java.util.Scanner;
public class Q14_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit number: ");
        int number = sc.nextInt();

        int rev = 0;
        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
