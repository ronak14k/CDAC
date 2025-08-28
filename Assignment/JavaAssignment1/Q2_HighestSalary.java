import java.util.Scanner;

class Q2_HighestSalary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Salary of company 1: ");
        int a = sc.nextInt();
        System.out.println("Enter Salary of company 2: ");
        int b = sc.nextInt();
        System.out.println("Enter Salary of company 3: ");
        int c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Company 1 has the Highest Salary ");
        }
        else if(b>a && b>c)
        {
            System.out.println("Company 2 has the highest Salary ");
        }
        else
        {
            System.out.println("Company 3 has the highest Salary ");
        }
    }
}
