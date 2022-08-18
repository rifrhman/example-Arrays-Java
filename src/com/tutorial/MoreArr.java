package com.tutorial;

import java.util.Arrays;

public class MoreArr {
    public static void main(String[] args) {
        System.out.println("More Arrays - Arrays Operation");
        System.out.println();

        int[] arrAngka1 = {1,2,3,4,5};

        // Merubah array menjadi string
        System.out.println("Merubah Array to String");
        printArr(arrAngka1);

        System.out.println();
        // Mengcopy Array dengan arraycopy
        System.out.println("Copy Array");
        int[] arrAngka2 = new int[5];
        System.arraycopy(arrAngka1,0,arrAngka2,0, arrAngka1.length);


        printArr(arrAngka1);
        printArr(arrAngka2);

        System.out.println();
        System.out.println("Copy Array dengan copyOf");
        // Copy Array dengan copyOf
        int[] arrAngka3 = Arrays.copyOf(arrAngka1,4);
        printArr(arrAngka3);

        System.out.println();
        System.out.println("Copy Array dengan copyOfRange");
        // Copy Array dengan copyOfRange
        int[] arrAngka4 = Arrays.copyOfRange(arrAngka1, 2, 5);
        printArr(arrAngka4);

        System.out.println();
        System.out.println("Fill Array dengan Arrays.fill");
        // Fill Array dengan Arrays.fill
        int[] arrAngka5 = new int[6];
        printArr(arrAngka5);
        Arrays.fill(arrAngka5, 2);
        printArr(arrAngka5);

        System.out.println();
        System.out.println("Komparasi Array");
        // Komparasi Array
        int[] arrAngka6 = {1,2,3,4,5};
        int[] arrAngka7 = {1,2,3,4,5};

        if (Arrays.equals(arrAngka6,arrAngka7)){
            System.out.println("Arr Sama dengan equals");
        } else{
            System.out.println("Arr ini beda dengan equals");
        }

        System.out.println();

        if(arrAngka6 == arrAngka7){
            System.out.println("Array ini Sama");
        } else {
            System.out.println("Array ini beda");
        }

        System.out.println();
        System.out.println("Cek besar antara 2 buah array dengan compare");
        // Menghasilkan 0,1,-1
        // Jika Arr6 lebih besar maka 1
        // Jika Arr7 lebih besar maka -1
        // Jika sama keduanya maka 0
        System.out.println(Arrays.compare(arrAngka6,arrAngka7));

        System.out.println();
        System.out.println("Cek index mana dari 2 buah arr yang berbeda");
        // Jika antara kedua arr sama, maka menghasilkan -1
        // Jika berbeda maka akan menunjukan beda array dari index yang dimulai dari 0
        System.out.println(Arrays.mismatch(arrAngka6,arrAngka7));


    }

    // Membuat fungsi untuk print Array to Srring
    private static void printArr(int[] prinArr){
        System.out.println("Array : " + Arrays.toString(prinArr));
    }
}