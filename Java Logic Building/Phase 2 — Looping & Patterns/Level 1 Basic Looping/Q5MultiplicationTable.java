// Print the table of a given number (n × 1 to n × 10). 

import java.util.Scanner;

public class Q5MultiplicationTable
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n = sc.nextInt();

            for(int i=1; i<=10; i++)
            {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}