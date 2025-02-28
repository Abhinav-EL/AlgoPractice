package com.test.app;

/**
 * Merging with smaller auxiliary array. Suppose that the subarray {a[0]} to
 * {a[n-1]} is sorted and the subarray {a[n]} to {a[2*n-1]} is sorted.
 *
 * How can you merge the two subarrays so that {a[0]} to {a[2*n-1]} is sorted
 * using an auxiliary array of length n (instead of 2n)?
 */
public class TestAssignmentSortedSubArray {
    int[] arr = {00, 20, 30, 50, 80, 10, 40, 60, 70, 90};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        /**
         * Important that the aux array gets created outside of recursion
         * for performance reasons
         */
        int[] aux = new int[5];

        merge(arr, aux, 0, 4,arr.length-1);
        return arr;
    }

    /**
     * Iterative merge - pay attention to for loop!
     * Same as MERGESORT
     *
     * @param a
     * @param aux
     * @param lo
     * @param mid
     * @param hi
     * @return
     */
    private int[] merge(int[] a, int[] aux, int lo, int mid, int hi){
        /* first copy the entire array into auxiliary array
        this is done to make the original array gets the sorted values*/
        for(int i=lo; i <= mid; i++){
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid+1;

        /* now travers the array using two pointers and merge them*/
        for(int k=lo; k<= hi; k++){
            if(i>mid) a[k] = a[j++];
            else if(j>hi) a[k] = aux[i++];
            else if(SortUtil.smaller(aux[i], a[j])) a[k] = aux[i++];
            else a[k] = a[j++];
        }

        return a;
    }
}
