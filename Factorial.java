import java.util.Scanner;
public class Factorial
{
	static long fact(int n)
	{
		if (n>0)
			return (n*fact(n-1));
		else 
			return 1;
	}
	public static void main(String[] args) {
		int n=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		try{
			n= sc.nextInt();
			System.out.println("Factorial is : "+fact(n));
			}
		catch (Exception e)
		{
			System.out.println("Input is not a valid integer.");
		}	
	}
}