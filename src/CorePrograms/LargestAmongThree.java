package CorePrograms;

import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();

        System.out.println("Enter the Third Number");
        int num3 = sc.nextInt();

        System.out.println(largestNo(num1, num2, num3));

    }

    public static int largestNo(int num1, int num2, int num3)
    {
        if(num1 > num2)
        {
            return num1;
        }
        else if (num2 > num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
    }

}
