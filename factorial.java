// program by @kryptiksage (Harikrishnan A)
import java.util.*;

class factorial
{   
    public static void main(String args[])
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try
        {
            int n = s.nextInt();
            int f=1;
            if( n<0 )
            System.out.println("Invalid");
            else
            {
                for(int i=1; i<=n; i++)
                f *= i;
                System.out.println("Factorial of "+n+" : "+f);
            }

        }
        catch(Exception e)
        {
            System.out.println("Not a valid integer");
        }
    }
}