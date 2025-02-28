package com.test.app;

/**
 * Does the recursion after it divides the array - this makes it opposite to Mergesort
 *
 * 1) Shuffle the array - required for performance
 *
 * 2) Then randomly partition the array around j - you have to find that element
 * --So that there is no value greater than a[j] to the left and no value smaller to the right
 * --Then recursively sort the two parts
 */

/**
 * This NlogN runtime on average because we are looking for that pivot to divide the array
 * around. And we keep doing this recursively, only to find the pivot point in next subtree.
 */
public class QuickSort {
    int[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){

        sort(arr, 0, arr.length-1);
        return arr;
    }

    private void sort(int[] a, int lo, int hi){
        if(hi<=lo) return;

        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a,j +1, hi);
    }

    /**
     * Pay attention to the index increments and decrements
     *
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private int partition(int[] a, int lo, int hi){
        int i = lo; // this is the left index moving towards right
        int j = hi+1; // this is the right index moving towards left

        while(true){
            /*This loop creates the condition that elements to left of 'lo' are smaller
            and elements to the right of 'lo' are greater*/

            while(SortUtil.smaller(a[++i], a[lo])) // find items on left to swap
                if(i>=hi) break;
            while(SortUtil.smaller(a[lo], a[--j])) // find items on right to swap
                if(j<=lo) break;

            if(i>=j) break; // check of pointers cross
            SortUtil.swap(a, i , j); // swap
        }

        // Done with partitioning, swap with partitioning element
        // This is necessary as the sort method is going partition around j
        SortUtil.swap(a, lo ,j);
        return j;
    }

}