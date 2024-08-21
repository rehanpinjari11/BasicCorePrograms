package CorePrograms;

import java.util.Scanner;

public class ComputeQuotientandRemainder {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dividend");
        int dividend = sc.nextInt();

        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = "+quotient);
        System.out.println("Remainder = "+remainder);

    }

}
