package com.test.app;

public class SortUtil {

    public static boolean smaller(Integer a, Integer b){
        return a.compareTo(b) < 0;

    }

    public static int[] swap(int[] arr, int posA, int posB){
        int temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;
        return arr;
    }
}
