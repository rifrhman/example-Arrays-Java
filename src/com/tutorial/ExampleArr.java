package com.tutorial;

import java.util.Arrays;

public class ExampleArr {
    public static void main(String[] args) {
        System.out.println("=== Example Of Arrays - Practice ===");
        System.out.println();

        // Inisialisasi 2 buah array
        int[] arrSatu = {2,3,5,6,60,4,7,98,1};
        int[] arrDua =  {20,4,5,3,15,2,22,7,81};
        // Print 2 buah array
        printArr(arrSatu, "Array 1");
        printArr(arrDua, "Array 2");

        System.out.println();
        // Jumlahkan 2 buah array
        resultTwoArrays(arrSatu,arrDua);

        System.out.println();
        // Menggabungkan 2 buah array menjadi satu
        mergeTwoArr(arrSatu,arrDua);

        System.out.println();
        // Sorting Reverse or Urutkan Terbalik
        sortReverse(arrSatu);

        System.out.println();
        sortReverseTwo(arrDua);


    }

    private static void printArr(int[] dataArr, String msg) {
        System.out.println(msg + " : " + Arrays.toString(dataArr));
    }

    // Function menambahkan opearasi 2 buah array
    private static void resultTwoArrays(int[] dataSatu, int[] dataDua){
        int[] newArr = new int[dataSatu.length];
        for (int i = 0; i < dataSatu.length; i++){
            newArr[i] = dataSatu[i] + dataDua[i];
        }
        System.out.println("Addition 2 Arrays :");
        printArr(newArr, "Result Addition");
    }

    private static void mergeTwoArr(int[] dataSatu, int[] dataDua){
        int[] newArr = new int[dataSatu.length + dataDua.length];
        System.arraycopy(dataSatu, 0, newArr, 0, dataSatu.length);
        for (int j = 0; j < dataDua.length; j++){
            newArr[j + dataSatu.length] = dataDua[j];
        }
        System.out.println("Merge 2 Arrays :");
        printArr(newArr, "Result Merge");
    }

    private static void sortReverse(int[] dataSatu){
        Arrays.sort(dataSatu);
        System.out.println("Sort Arrays First :");
        System.out.println("Sort Arr : " + Arrays.toString(dataSatu));
        int[] newArr = Arrays.copyOf(dataSatu, dataSatu.length);
        for (int i = 0; i < dataSatu.length; i++){
            dataSatu[i] = newArr[(dataSatu.length - 1) - i];
        }

        printArr(dataSatu, "Sort Reverse Arr");
    }

    private static void sortReverseTwo(int[] dataArray){
        Arrays.sort(dataArray);
        System.out.println("Sort Arrays Second :");
        System.out.println("Sort Arr : " + Arrays.toString(dataArray));
        int dummy;
        for (int i = 0; i < dataArray.length / 2; i++){
            dummy = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = dummy;
        }
        printArr(dataArray, "Sort Reverse Arr 2");
    }
}
