/* 10. Exam Attendance Eligibility
Scenario: A student can sit in exams only if attendance >=75%. Take total classes held and attended as
input, print allowance.
Input:
Enter total classes held: 100
Enter classes attended: 78
Output:
Student is allowed to sit for the exam. */

import java.util.Scanner;
public class Q10_ExamAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total classes held: ");
        int totalClasses = sc.nextInt();
        System.out.println("Enter classes attended: ");
        int attendedClasses = sc.nextInt();

        double attendancePercentage = (attendedClasses / (double) totalClasses) * 100;
        String result = (attendancePercentage >= 75) ? "Student is allowed to sit for the exam." : "Student is not allowed to sit for the exam.";
        System.out.println(result);
    }
}
