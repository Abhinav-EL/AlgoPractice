package com.test.app;

/**
 * Dutch national flag. Given an array of nn buckets, each containing a red, white, or blue pebble,
 * sort them by color. The allowed operations are:
 *
 * swap(i, j): swap the pebble in bucket i with the pebble in bucket j.
 * color(i): determine the color of the pebble in bucket i.
 */
public class TestAssignmentShellString {
    String[] arr = {"red", "blue", "white", "white", "white", "blue", "blue", "red", "red"};
    int[] shells = {7 ,4, 1};

    /**
     * Just print the array being passed
     */
    public void printArray(){
        System.out.println("--- Printing Array --- ");
        for(int i =0; i<arr.length; i++){
            System.out.println("position: "+i + " value: "+arr[i]);
        }
    }

    public String[] sortArray(){
        for(int h = 0; h< shells.length; h++){
            //System.out.println("counter: "+shells[h]);
            for (int i = 0; i< arr.length; i++){
                //System.out.println("cnt i: "+i);
                for(int j=i; j>= 0 && j-shells[h]>=0; j=j-shells[h]){
                    //System.out.println("j: "+j+ " diff "+(j-shells[h]));
                    if(smaller(arr[j],arr[j-shells[h]])) {
                        //System.out.println("Swapping: "+j +" & "+ (j - shells[h]));
                        swap(arr, j, j - shells[h]);
                    }
                }
            }
        }
        return arr;
    }

    private boolean smaller(String a, String b){
        return a.compareTo(b) < 0;
    }

    private String[] swap(String[] arr, int posA, int posB){
        String temp = arr[posA];
        arr[posA] = arr[posB];
        arr[posB] = temp;

        return arr;
    }

}
