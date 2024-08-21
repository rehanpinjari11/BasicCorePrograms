package CorePrograms;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n/2 ; i++)
        {
            if (n == 1)
            {
                continue;
            }

            if(n % i == 0)
            {
                if(i % 2 != 0)
                {
                    System.out.println("Prime Factors of a Number is "+i);

                }
            }

        }
    }

}
