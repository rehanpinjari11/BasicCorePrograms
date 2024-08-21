package CorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("First Number = "+num1);
        System.out.println("Second Number = "+num2);

        int c = num1;
        num1 = num2;
        num2 = c;

        System.out.println("===================");

        System.out.println("After Swapping");
        System.out.println("First Number = "+num1);
        System.out.println("Second Number = "+num2);

    }
}
