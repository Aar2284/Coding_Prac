// Print the product of digits of a given number

import java.util.Scanner;

public class Q10ProductOfDigits
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();
            int product = 1;

            if(n < 0)
            {
                System.out.println("Invalid Input");
                return;
            }

            while(n > 0)
            {
                int digit = n % 10;
                product *= digit;
                n /= 10;
            }

            System.out.println("Product of digits is: " + product);
        }
    }
}