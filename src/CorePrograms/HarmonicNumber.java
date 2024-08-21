package CorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int harmonicVal = 0;

        if(n == 0)
        {
            System.out.println("n must be non-zero");
        }

        for (int i = 1; i <= n; i++)
        {
            harmonicVal += 1 / i;
        }

        System.out.println("The " + n + "th harmonic number is: " + harmonicVal);

    }
}
