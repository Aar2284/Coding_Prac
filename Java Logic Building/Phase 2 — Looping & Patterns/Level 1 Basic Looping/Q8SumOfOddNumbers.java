// Print the sum of all odd numbers up to n. 

import java.util.Scanner;

public class Q8SumOfOddNumbers
{
    public static void main(String[] args) {
        {
            try (Scanner sc = new Scanner(System.in))
            {
                int num = sc.nextInt();
                int sum = 0;

                for(int i = 1; i<=num; i++)
                {
                    if(i % 2 !=0)
                    {
                        sum += i;
                    }
                }

                System.out.println("Sum: "+ sum);
            }
        }
    }
}