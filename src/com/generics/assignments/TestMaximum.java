
//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
//Use Case 3 is to give 3 strings and find out the maximum and its position in array.
//Refactoring 1 - all 3 to one generic method and find out the maximum.
//Refactoring 2 - to take 3 variables of generic types and find out maximum.
//Use Case 4 is to extend the max method to take more than three parameters.
package com.generics.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TestMaximum <T> {
    //Creating 3 variables.
    T[] typeArray;

    //Creating Parameterized constructor for generic data types.
    public TestMaximum(T[] typeArray)
    {
        this.typeArray = typeArray;
    }

    //Default Constructor
    public TestMaximum()
    {
        System.out.println("Welcome to Generic Assignment Problem.");
    }

    public static void main(String[] args) {
        //Initialization of object.
        TestMaximum testMaximum = new TestMaximum();

        //Define the array where size is 3(given).
        Integer[] intArray = {5,6,8,7,9};
        Float[] floatArray = {8.5f,5.5f,2.3f,3.9f,6.4f,1.2f};
        String[] strArray = {"Apple","Peach","Banana","Guava","Papaya"};

        getMaximum(new TestMaximum(intArray));
        getMaximum(new TestMaximum(floatArray));
        getMaximum(new TestMaximum(strArray));

    }

    //Get maximum from the 3 variables.
    public static <T extends Comparable<T>> void getMaximum(TestMaximum testMaximum) {
        Arrays.sort(testMaximum.typeArray);
        T max = (T) testMaximum.typeArray[0];
        int position = 0;
        for (int i = 0; i < testMaximum.typeArray.length; i++)

        {
            T a = (T)testMaximum.typeArray[i];
            int b = a.compareTo(max);
            if(b > 0)
            {
                max = (T) testMaximum.typeArray[i];
                position = i;
            }
        }
        System.out.println("Array is sorted.");
        System.out.println("\nMaximum integer is : "+max);
        System.out.println("Maximum integer position is : "+position+" in array.");
        printArray(testMaximum.typeArray);

    }

    //Print the maximum
    public static void printArray(Object[] typeArray) {
        for (Object element : typeArray)
        {
            System.out.println(element+"  ");
        }
    }
}
