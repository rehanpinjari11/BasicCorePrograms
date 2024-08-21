package CorePrograms;

import java.util.Scanner;

public class CheckEvenOddNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        evenOdd(n);


    }

    public static void evenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println(n+" is Even Number");
        }
        else {
            System.out.println(n+" is Odd Number");
        }
    }
}
