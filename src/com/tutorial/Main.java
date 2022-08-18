package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){
        // Assigment Array
        System.out.println("Assigment Array");
        int[] arr = {2, 4, 5, 6, 7};

        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // Deklarasi array
        System.out.println("Deklarasi Array");
        float[] newArr = new float[5];
        newArr[2] = 20.4f;
        for (float j : newArr){
            System.out.println(j);
        }
        System.out.println(Arrays.toString(newArr));
    }
}
