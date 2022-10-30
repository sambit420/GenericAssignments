
//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
//Use Case 3 is to give 3 strings and find out the maximum and its position in array.
//Refactoring all 3 to one generic method and find out the maximum.

package com.generics.assignments;

import java.util.Scanner;

public class TestMaximum {


    //Default Constructor
    public TestMaximum() {
        System.out.println("Welcome to Generic Assignment Problem.");
    }

    public static void main(String[] args) {
        //Initialization of object.
        TestMaximum testMaximum = new TestMaximum();

        //Define the array where size is 3(given).
        Integer[] intArray = {3, 4, 8};
        Float[] floatArray = {5.2f, 4.5f, 3.5f};
        String[] stringArray = {"Apple", "Peach", "Banana"};
        System.out.println("Considering integer array");
        printArray(intArray);
        getMaximum(intArray);
        System.out.println("Considering float array");
        printArray(floatArray);
        getMaximum(floatArray);
        System.out.println("Considering string array");
        printArray(stringArray);
        getMaximum(stringArray);
    }

    //Get maximum from the array and its position.
    public static <T extends Comparable<T>> void getMaximum(T[] array) {
        T max = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            int a = array[i].compareTo(max);
            if (a > 0) {
                max = array[i];
                position = i;
            }
        }
        System.out.println("\nMaximum integer is : " + max);
        System.out.println("Maximum integer position is : " + position + " in array.");
    }

    //Printing the array.
    public static <T> void printArray(T[] array) {
        System.out.println("Array is : ");
        for (T element : array) {
            System.out.print(element + "  ");
        }
    }
}
