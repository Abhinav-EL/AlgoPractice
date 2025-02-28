package com.test.app;

/**
 * Shell sort is the elementary sort where current element<br>
 * is compared to previous element, similar to Insertion Sort.
 *<pr>
 * But instead of going back only by one single index, it goes back multiple.<br>
 * This means we scan the array multiple times, each time jumping back by different steps
 */
public class ShellSort {
    int[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80};
    int[] shells = {7 ,4, 1};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        for(int h = 0; h< shells.length; h++){
            //System.out.println("counter: "+shells[h]);
            for (int i = 0; i< arr.length; i++){
                //System.out.println("cnt i: "+i);
                for(int j=i; j>= 0 && j-shells[h]>=0; j=j-shells[h]){
                    //System.out.println("j: "+j+ " diff "+(j-shells[h]));
                    if(SortUtil.smaller(arr[j],arr[j-shells[h]])) {
                        //System.out.println("Swapping: "+j +" & "+ (j - shells[h]));
                        SortUtil.swap(arr, j, j - shells[h]);
                    }
                }
            }
        }
        return arr;
    }
}
