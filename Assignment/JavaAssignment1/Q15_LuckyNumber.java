/* 15. Lucky Number Check
Scenario: A 4-digit number ABCD is lucky if A+B = C+D. Check if a number is lucky.
Input:
Enter 4-digit number: 3521
Output:
Not a lucky number */

import java.util.Scanner;
public class Q15_LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4-digit number: ");
        int number = sc.nextInt();

        int a = number / 1000;
        int b = (number / 100) % 10;
        int c = (number / 10) % 10;
        int d = number % 10;

        if ((a + b) == (c + d)) {
            System.out.println("Lucky number");
        } else {
            System.out.println("Not a lucky number");
        }
    }
}
