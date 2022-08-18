package com.tutorial;

public class PracticeArrTwoDimension {

    private static void printArr(int[][] dataArr){
//        int baris = dataArr.length;
        int kolom = dataArr[0].length;

        for (int[] ints : dataArr) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(ints[j]);
                if (j < (kolom - 1)) {
                    System.out.print(", ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    private static void additionTwoArraysD(int[][] dataArrOne, int[][] dataArrTwo){
        int barisSatu = dataArrOne.length;
        int kolomSatu = dataArrOne[0].length;
        int barisDua = dataArrTwo.length;
        int kolomDua = dataArrTwo[0].length;

        int[][] result = new int[barisSatu][kolomSatu];

        if (barisSatu == barisDua && kolomSatu == kolomDua){
        for (int i = 0; i < barisSatu; i++){
            for (int j = 0; j < kolomSatu; j++){
                result[i][j] = dataArrOne[i][j] + dataArrTwo[i][j];
            }
        }
        } else {
            System.out.println("Jumlah baris dan kolom tidak sama");
        }
        printArr(result);

    }

    private static void multipleTwoArraysD(int[][] dataSatu, int[][] dataDua){
        int barisSatu = dataSatu.length;
        int kolomSatu = dataSatu[0].length;
        int barisDua = dataDua.length;
        int kolomDua = dataDua[0].length;

        // Jika melakukan perkalian 2D arrays maka
        // Jumlah baris akan mengikuti kolom array pertama
        // Dan jumlah kolom akan mengikuti kolom yang kedua

        int[][] resultMultipleArr = new int[barisSatu][kolomDua];

        int dummy;

        if(kolomSatu == barisDua){
            for (int i = 0; i < barisSatu; i++){
                for (int j = 0; j < kolomDua; j++){
                    dummy = 0;
                    for (int k = 0; k < kolomSatu; k++){
                        dummy += dataSatu[i][k] * dataDua[k][j];
                    }
                    resultMultipleArr[i][j] = dummy;
                }
            }
        } else {
            System.out.println("Jumlah kolom matrix pertama tidak sama dengan Jumlah baris matrix ke dua");
        }


        printArr(resultMultipleArr);

    }

    public static void main(String[] args) {
        System.out.println("=== Latihan Array 2 Dimensi ===");
        // Initialization array matrix in main method
        int[][] matrixA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] matrixB = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };

        int[][] matrixC = {
                {1,2},
                {3,4},
        };
        int[][] matrixD = {
                {11,12},
                {13,14},
        };



        printArr(matrixA); // print matrix A
        printArr(matrixB); // print matrix b
        additionTwoArraysD(matrixA, matrixB); // print addition Arrays 2 dimension
        multipleTwoArraysD(matrixC, matrixD);
    }
}





















