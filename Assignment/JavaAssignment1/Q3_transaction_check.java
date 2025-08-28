/*3. Bank Transaction Check
Scenario: You check your bank account and see a transaction amount. Print whether the transaction is a
deposit (positive) or a withdrawal (negative).
Input:
Enter transaction amount: -2500 */

import java.util.Scanner;

class Q3_transaction_check
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter transaction amount: ");
        int amount = sc.nextInt();

        if(amount > 0)
        {
            System.out.println("Deposit Transaction");
        }
        else
        {
            System.out.println("Withdrawal Transaction");
        }
    }
}
