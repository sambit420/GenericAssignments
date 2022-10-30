package com.generics.assignments;

import java.util.Scanner;

public class TestMaximum {

    //Default Constructor
    public TestMaximum()
    {
        System.out.println("Welcome to Generic Assignment Problem.");
    }

    public static void main(String[] args) {
        //Initialization of object.
        TestMaximum testMaximum = new TestMaximum();

        //Define the array where size is 3(given).
        Integer[] array = addToArray();
        printArray(array);
        getMaximum(array);
    }

    //Get maximum from the array and its position.
    public static void getMaximum(Integer[] array) {
        int max = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++)
        {
            int a = array[i].compareTo(max);
            if(a > 0)
            {
                max = array[i];
                position = i;
            }
        }
        System.out.println("\nMaximum integer is : "+max);
        System.out.println("Maximum integer position is : "+position+" in array.");
    }

    //Printing to array.
    public static void printArray(Integer[] array) {
        System.out.println("Array is : ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+"  ");
        }
    }

    //Adding values to array.
    public static Integer[] addToArray() {
        System.out.println("Enter 3 values");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        return new Integer[]{a,b,c};
    }
}
