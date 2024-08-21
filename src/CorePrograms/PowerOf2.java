package CorePrograms;

import java.util.Scanner;

public class PowerOf2 {

    public static void main(String[] args)
    {
        int n = 31;
        power(n);

    }

    public static void power(int n)
    {
        if(n >= 0 || n <= 31)
        {
            for (int i = 0; i <= n; i++) {
                System.out.println("2^" + i + " = " + (1 << i));

            }
        }
        else {
            System.out.println("Please provide an integer N such that 0 <= N < 31.");
        }
    }

}
