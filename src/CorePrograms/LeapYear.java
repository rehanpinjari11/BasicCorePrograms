package CorePrograms;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if(year > 1000 || year < 9999)
        {
            leap(year);
        }
        else
        {
            System.out.println("Please enter the four digit number");
        }

    }

    public static void leap(int year)
    {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                System.out.println(year+" is a Leap Year");

            }
            else {
                System.out.println(year+" is not a Leap Year");
            }
    }
}

