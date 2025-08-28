import java.util.Scanner;

class Q1_Greatest
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter score for Test 1: ");
		int a= sc.nextInt();
		System.out.println("Enter score for Test 2: ");
		int b= sc.nextInt();
		
		if(a>b)
		{
			System.out.println("Test 1 has the Highest score ");
		}
		else
		{
			System.out.println("Test 2 has the highest score ");
		}
	}
}