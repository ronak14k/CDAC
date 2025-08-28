/* 2. Oldest and Youngest Among Three Friends
Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the
oldest and youngest.
Input:
Enter age of Friend 1: 22
Enter age of Friend 2: 25
Enter age of Friend 3: 20
Output:
Oldest: Friend 2
Youngest: Friend 3 */

import java.util.Scanner;
public class Q12_OldestYoungest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Friend 1: ");
        int age1 = sc.nextInt();
        System.out.println("Enter age of Friend 2: ");
        int age2 = sc.nextInt();
        System.out.println("Enter age of Friend 3: ");
        int age3 = sc.nextInt();

        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        System.out.println("Oldest: " + (oldest == age1 ? "Friend 1" : oldest == age2 ? "Friend 2" : "Friend 3"));
        System.out.println("Youngest: " + (youngest == age1 ? "Friend 1" : youngest == age2 ? "Friend 2" : "Friend 3"));
    }
}
