package com.tutorial;

import java.util.Arrays;

public class LatihanArr {
    public static void main(String[] args) {
        System.out.println("Latihan Array");
        System.out.println();

        int[] arr = {3,5,4,2,5,6,4,7};
        int[] arr2 = new int[8];
        System.arraycopy(arr,0,arr2,0,arr.length);
        // Print Array
        printArr(arr);

        // Sort Array Print
        System.out.println();
        sortArr(arr);
        // Reverse Array
        System.out.println();
        revers(arr);
        // Addition 2 array
        System.out.println();
        addArr(arr, arr2);

        // Merged 2 of Arrays
        System.out.println();
        mergeArr(arr,arr2);




    }

    private static void printArr(int[] print){
        System.out.println("Array : " + Arrays.toString(print));
    }

    private static void sortArr(int[] sortAr){
       Arrays.sort(sortAr);
        System.out.println("Data Array Sort : " + Arrays.toString(sortAr));
    }

    private static void revers(int[] reversed){
        for (int i = 0; i < 1; i++){
            System.out.print("Data Array Reversed : [");
            for (int j = reversed.length - 1; j >= 0; j--){
                if (j >= 1){
                    System.out.print(reversed[j] + ", ");
                }else {
                    System.out.print(reversed[j] + "]");
                }
            }
            System.out.println();
        }
    }

    private static void addArr(int[] dataArr1, int[] dataArr2){
        int[] newArr = new int[dataArr1.length];
        for (int i = 0; i < dataArr1.length; i++){
            newArr[i] = dataArr1[i] + dataArr2[i];
        }
        System.out.println("Addition Arrays : " + Arrays.toString(newArr));
    }

    private static void mergeArr(int[] dataArr, int[] dataArr2){
        int arrLength = dataArr.length + dataArr2.length;
        int[] newArr = new int[arrLength];
        for (int i = 0; i < arrLength;i++){
            if (i < dataArr.length){
                newArr[i] = dataArr[i];
            } else{
                newArr[i] = dataArr2[i - dataArr2.length];
            }
        }
        System.out.println("Merge 2 Arrays : ");
        System.out.println(Arrays.toString(newArr));
    }


}
