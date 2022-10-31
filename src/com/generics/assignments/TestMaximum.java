
//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
//Use Case 3 is to give 3 strings and find out the maximum and its position in array.
//Refactoring 1 - all 3 to one generic method and find out the maximum.
//Refactoring 2 - to take 3 variables of generic types and find out maximum.
//Use Case 4 is to extend the max method to take more than three parameters.
//Use Case 5 is to extend the max method to also print the max to std out using Generic Method.

package com.generics.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TestMaximum <T extends Comparable<T>> {

    //Creating 3 variables.
    T x, y, z;

    //Creating Parameterized constructor for generic data types.
    public TestMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Default Constructor
    public TestMaximum()
    {
        System.out.println("Welcome to Generic Assignment Problem.");
    }

    public T maximum()
    {
        return TestMaximum.maximum(x, y, z);
    }

    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0)
        {
            max = y; // y is the largest so far
        }
        if (z.compareTo(max) > 0)
        {
            max = z; // is the largest now
        }
        printMax(x, y, z, max);
        return max; // returns the largest object
    }

    public static String testMaximum(String x, String y, String z)
    {
        String max = x;
        if(y.compareTo(max) > 0)
        {
            max = y; // y is the largest so far
        }
        if(z.compareTo(max) > 0)
        {
            max = z;// is the largest
        }
        //now printMax(x, y, z, max);
        printMax(x, y, z, max);
        return max; // returns the largest object
    }

    public static <T> void printMax(T x, T y, T z, T max)
    {
        System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
    }

    public static void main(String[] args) {
        //Initialization of object.
        TestMaximum testMaximum = new TestMaximum();

        //Define the array where size is 3(given).
        Integer xInt = 5, yInt = 6, zInt = 7;
        Float xFlt = 5.5f, yFlt = 4.5f, zFlt = 3.5f;
        String xStr = "Apple", yStr = "Peach", zStr = "Banana";

        TestMaximum.testMaximum(xStr, yStr, zStr);
        new TestMaximum(xInt, yInt, zInt).maximum();
        new TestMaximum(xFlt, yFlt, zFlt).maximum();
        new TestMaximum(xStr, yStr, zStr).maximum();
        }
    }
