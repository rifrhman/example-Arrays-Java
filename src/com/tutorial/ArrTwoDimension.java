package com.tutorial;

import java.util.Arrays;

public class ArrTwoDimension {
    public static void main(String[] args) {
        System.out.println("=== Java Array 2 Dimension ===");
        System.out.println();

        // Contoh array 2 dimensi dan implementasi
        // Contoh array 2 dimensi dengan assignment
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("Alamatnya :");
        // toString akan menghasilkan alamat dari array nya
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Nilai Array nya :");
        // deepToString akan menghasilkan array dari 2 dimensi tsb. (nilainya)
        printArr2D(arr);
        System.out.println();

        // Contoh array 2 dimensi dengan deklarasi
        // Array deklarasi dengan 2 bracket berisi
        // int [baris] [kolom]
        // barisnya array 5 kotak dengan isi setiap array 4 kolom
        int[][] newArr = new int[5][4];
        printArr2D(newArr);
        System.out.println();
        // loop Manual
        loopManual(newArr);

        System.out.println();
        int[][] arr2D = {
            {1,2,4,5,3,4},
            {2,3,45,5,4,5,6,4,6},
            {3,4,5,4,8,9,7,9,4,2,1}
        };


        printArr2D(arr2D);

    }

    private static void printArr2D(int[][] dataArr){
//        for (int i = 0; i < dataArr.length; i++){
//            // menampilkan data arrays 2 dimensi dengan .toString didalam loop
//            System.out.println(Arrays.toString(dataArr[i]));
//        }
        for (int[] baris : dataArr){
            System.out.print("[ ");
            for (int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.println("]");
        }
    }

    private static void loopManual(int[][] dataArr){

        for (int i = 0; i < dataArr.length; i++){
            System.out.print("[");
            for (int j = 0; j < dataArr[i].length; j++){
                System.out.print(dataArr[i][j] + " , ");
            }
            System.out.print("]\n");
        }
    }

}
