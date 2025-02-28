package com.test.app;

public class TestMergeSort {
    int[] arr = new int[10];
    int[] aux = new int[10];

    //Recursive first and then partition
    public void sortArray(){



    }

    public void sort(int[] arr, int lo, int hi){
        if(hi<=lo) return;

        int mid = lo + (hi-lo)/2;
        sort(arr, lo, mid);
        sort(arr, mid+1, hi);
        merge(arr, aux, lo, mid, hi);
    }

    public void merge(int[] arr, int[] aux, int lo, int mid, int hi){
        //copy aux
        int i = lo;
        int j = mid+1;
        for(int k=0; k<hi; k++){
            if(i>mid) arr[k] = aux[j++];
            else if(j>hi) arr[k] = aux[i++];
            else if(SortUtil.smaller(arr[i], arr[j])) arr[k] = arr[i++];
            else arr[k] = arr[j++];
        }
    }
}
