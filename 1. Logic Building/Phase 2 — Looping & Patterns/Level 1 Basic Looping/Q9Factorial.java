// Print the factorial of a given number.

import java.util.Scanner;

public class Q9Factorial
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int factorial = 1;

            if(n < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            for(int i=1; i<=n; i++)
            {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }
    }
}