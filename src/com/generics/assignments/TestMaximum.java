
//Use Case 1 is to give 3 integers and find out the maximum and its position in array.
//Use Case 2 is to give 3 floats and find out the maximum and its position in array.
//Use Case 3 is to give 3 strings and find out the maximum and its position in array.
//Refactoring 1 - all 3 to one generic method and find out the maximum.
//Refactoring 2 - to take 3 variables of generic types and find out maximum.

package com.generics.assignments;

import java.util.Scanner;

public class TestMaximum <T> {

    //Creating 3 variables.
    T a,b,c;

    //Creating Parameterized constructor for generic data types.
    public TestMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        Integer xInt = 5, yInt = 6, zInt = 7;
        Float xFlt = 5.5f, yFlt = 4.5f, zFlt = 3.5f;
        String xStr = "Apple", yStr = "Peach", zStr = "Banana";

        getMaximum(new TestMaximum(xInt,yInt,zInt));
        getMaximum(new TestMaximum(xFlt,yFlt,zFlt));
        getMaximum(new TestMaximum(xStr,yStr,zStr));

    }

    //Get maximum from the 3 variables.
    public static <T extends Comparable<T>> void getMaximum(TestMaximum testMaximum) {
        T x = (T) testMaximum.a;
        T y = (T) testMaximum.b;
        T z = (T) testMaximum.c;
        T max = x;
        if (y.compareTo(max) > 0)
        {
            max = y;
        }
        if (z.compareTo(max) > 0)
        {
            max = z;
        }
        printMax(x,y,z,max);
    }

    //Print the maximum
    public static <T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);

    }
}
