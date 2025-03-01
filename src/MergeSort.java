
/**
 * Divide and conquer philosophy -
 * 1. At each step divide the array in half
 * 2. Then put it together by a merge process that traverses two ends of the array
 *
 * Heavy use of recursion - PAY attention to for loops
 */

/**
 * This is NlogN as the algorithm sorts the array around its mid point.
 * The mid point for array sub array is calculated. Even though the call is recursive,
 * we are halving the array each time.
 */
public class MergeSort {
    int[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80};

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

    /**
     * Recurssion is starting here
     *
     * @param a
     * @param aux
     * @param lo
     * @param hi
     */
    private void sort(int[] a, int[] aux, int lo, int hi){
        if(hi<=lo) return;

        int mid = lo + (hi-lo)/2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid +1, hi);

        //System.out.println("lo: "+lo+ " mid: "+mid + " hi: "+hi);
        merge(a, aux, lo, mid, hi);
    }

    /**
     * Iterative merge - pay attention to for loop!
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
