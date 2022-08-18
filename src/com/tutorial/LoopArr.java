package com.tutorial;

import java.util.Arrays;

public class LoopArr {
    public static void main(String[] args) {
        // Menampilkan array berdasarkan properti array.toString()
        int[] angkaArr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        System.out.println(Arrays.toString(angkaArr));

        System.out.println();
        // Menampilkan array dengan looping standart
        for (int i = 0; i < 10; i++) {
            System.out.println("Ini adalah index ke - " + i + " array nya : " + angkaArr[i]);
        }
        System.out.println();

        // Menampilkan array dengan properti .length <- array
        for (int j = 0; j < angkaArr.length; j++) {
            System.out.println("Ini adalah index ke - " + j + " array nya : " + angkaArr[j]);
        }
        System.out.println();
        // Menampilkan array dengan for each
        for (int k : angkaArr) {
            System.out.println("Ini adalah array nya : " + k);
        }


        System.out.println();
        System.out.println("Sort - Array");
        int[] sortArr = {1, 2, 6, 5, 7, 5, 4, 3};
        printArr(sortArr);
        Arrays.sort(sortArr);
        printArr(sortArr);

        System.out.println();
        System.out.println("Search - Array");
        int angkaSearch = 5;
        int posisiArr = Arrays.binarySearch(sortArr,angkaSearch);
        System.out.println("Posisi Arr : " + angkaSearch + " Ada di index = " + posisiArr);
    }
    private static void printArr ( int[] prinArr){
        System.out.println("Array : " + Arrays.toString(prinArr));
    }
}
