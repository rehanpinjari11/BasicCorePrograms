package CorePrograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter the number of times you want to flip the coin.");
        int noOfFlip = sc.nextInt();

        if (noOfFlip <= 0)
        {
            System.out.println("Please Enter a Positive Integer");
            return;
        }

        int headCount = 0;
        int tailCount = 0;

        for (int i = 1; i <= noOfFlip; i++)
        {
            if(r.nextDouble() < 0.5)
            {
                tailCount++;
            }
            else
            {
                headCount++;
            }

        }

        double headPercentage = ((double) headCount / noOfFlip) * 100;
        double tailPercentage = ((double) tailCount / noOfFlip) * 100;

        System.out.println("Head Percentage: "+ headPercentage + "%");
        System.out.println("Tail Percentage: "+ tailPercentage + "%");

    }


}
