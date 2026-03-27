// Print the sum of all even numbers up to n. 

import java.util.Scanner;
public class Q7SumOfEvenNumbers
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int sum =0;

            if(n < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            for(int i=0; i<=n; i++)
            {
                if(i % 2 == 0)
                {
                    sum += i;
                }
            }

            System.out.println("Sum of Even Numbers is: " + sum);
        }
    }
}