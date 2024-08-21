package FunctionalPrograms;

import java.util.Scanner;

public class Triplet {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the element for index " +i);

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the Target Value:");
        int target = sc.nextInt();

        triplet(arr, target);


    }
    
    public static void triplet(int[] arr, int target)
    {
        for (int i = 0; i < arr.length - 2; i++)
        {
            for (int j = i + 1; j < arr.length - 1 ; j++)
            {
                for (int k = j + 1; k < arr.length ; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == target)
                    {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }

                }

            }
            
        }
    }


}
