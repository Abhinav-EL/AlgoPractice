package com.test.app;

public class TestQuickSort {
    // Partition first and then recursive traverse the array
    int[] arr = new int[10];

    public void sortArray(){
        sort(0, arr.length);
    }

    public void sort(int lo, int hi){
        int j = partition(arr, lo, hi);
        sort(lo, j);
        sort(j+1, hi);
    }

    public int partition(int[] arr, int lo, int hi){
        int i = lo;
        int j = hi;
        int k = lo;

        //keep going until all indexes cross
        while(true){
            while(SortUtil.smaller(arr[++i],arr[k]))
                if(i>=hi) break;
            while(SortUtil.smaller(arr[k], arr[--j]))
                if(j<=lo) break;
            if(i>=j) break;
            SortUtil.swap(arr, i, j);
        }

        SortUtil.swap(arr, k, j);

        return j;
    }
}
