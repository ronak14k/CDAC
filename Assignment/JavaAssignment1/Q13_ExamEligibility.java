/* 13. Exam Eligibility with Medical Cause
Scenario: A student’s attendance is low but may have medical cause. Take classes held, attended, and
medical cause (Y/N) as input and decide if the student can sit in exam.
Input:
Classes held: 100
Classes attended: 60
Medical cause (Y/N): Y
Output:
Student is allowed to sit for the exam. */

import java.util.Scanner;
public class Q13_ExamEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Classes held: ");
        int classesHeld = sc.nextInt();
        System.out.println("Classes attended: ");
        int classesAttended = sc.nextInt();
        System.out.println("Medical cause (Y/N): ");
        char medicalCause = sc.next().charAt(0);

        double attendancePercentage = (classesAttended / (double) classesHeld) * 100;
        boolean isAllowed = attendancePercentage >= 75 || medicalCause == 'Y';

        System.out.println(isAllowed ? "Student is allowed to sit for the exam." : "Student is not allowed to sit for the exam.");
    }
}
