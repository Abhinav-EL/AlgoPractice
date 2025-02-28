package com.test.app;

/**
 * Selection sort is the elementary sort where each element
 * is compared to current element and if found to
 * be smaller value, swapped
 */
public class SelectionSort {
    int[] arr = new int[10];

    public SelectionSort(){
        for(int i =0; i <arr.length; i++){
            arr[i] = i* -1 ;
        }
    }

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        for (int i = 0; i< arr.length; i++){
            // This cannot start from j=i, because say you have array
            // with [0, 4 ,1]. This is already sorted if we only look
            // at things to the right. Which is wrong, and hence
            // we look at the entire array
            for(int j=0; j< arr.length; j++){
                if(SortUtil.smaller(arr[i],arr[j])){
                    SortUtil.swap(arr, i, j);
                }
            }
        }

        return arr;
    }
}
