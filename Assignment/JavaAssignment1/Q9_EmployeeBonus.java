/* 9. Employee Bonus Eligibility
Scenario: A company gives a 5% bonus to employees with more than 5 years of service. Take salary and
years of service as input and print bonus amount.
Input:
Enter salary: 50000
Enter years of service: 6
Output:
Bonus amount: 2500 */

import java.util.Scanner;
public class Q9_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
