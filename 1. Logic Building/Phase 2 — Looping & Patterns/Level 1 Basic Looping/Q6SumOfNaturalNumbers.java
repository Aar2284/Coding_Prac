// Print the sum of first n natural numbers.

import java.util.Scanner;

public class Q6SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int finalsum = 0;

            for(int i=1; i<=n; i++)
            {
                finalsum += i;
            }

            System.out.println("Sum of "+n+" Natural Numbers: "+ finalsum);
        }
    }
}