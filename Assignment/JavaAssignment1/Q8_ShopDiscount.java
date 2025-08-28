/* 8. Shop Discount Calculation
Scenario: A shop offers 10% discount if the purchase amount exceeds 1000. Take total purchase amount
as input and calculate final cost.
Input:
Enter total purchase amount: 1200
Output:
Final cost after discount: 1080 */

import java.util.Scanner;
public class Q8_ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        double finalCost = (purchaseAmount > 1000) ? purchaseAmount * 0.90 : purchaseAmount;
        System.out.println("Final cost: " + finalCost);
    }
}
