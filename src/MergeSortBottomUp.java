package com.test.app;

/**
 * A version of Mergesort, which is not recusrsive
 */
public class MergeSortBottomUp {

    int[] arr = {110, 40, 50, 60, 30, 90, 70, 00 , 20, 80, 10};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        /**
         * Important that the aux array gets created outside of recursion
         * for performance reasons
         */
        int[] aux = new int[arr.length];

        sort(arr, aux, 0, arr.length-1);
        return arr;
    }

    private void sort(int[] a, int[] aux, int lo, int hi){

        for(int i = 1; i< arr.length ; i = i+i){ //1, 2, 4, 8
            for(int j = 0; j< arr.length; j =j+i+i){ //i =1; j = 2, 4, 8
                //System.out.println("i: "+i + " j: "+j);
                /* Math min is saying the Max index, that is passed to merge method,
                has a limit as the Min of next iteration of j (inner loop) or
                the max index value in the array */
                merge(a, aux, j, i+j-1, Math.min(j+i+i -1, arr.length-1));
            }
        }
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
        for(int i=lo; i <= hi; i++){
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid+1;

        /* now travers the array using two pointers and merge them*/
        for(int k=lo; k<= hi; k++){
            if(i>mid) a[k] = aux[j++];
            else if(j>hi) a[k] = aux[i++];
            else if(SortUtil.smaller(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }

        return a;
    }
}
