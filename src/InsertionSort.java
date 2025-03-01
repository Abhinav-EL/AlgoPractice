/**
 * Insertion sort is the elementary sort where current element
 * is compared to previous element and if found to
 * be smaller value, swapped until correct position found.
 * Which means this sorting algorithm goes backwards if something found out of order
 * This improves performance
 */
public class InsertionSort {
    int[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        for (int i = 0; i< arr.length; i++){ // i represents the current position
            for(int j=i; j> 0; j--){ // j represents the position to compare to current
                if(SortUtil.smaller(arr[j],arr[j-1])){
                    SortUtil.swap(arr, j, j-1);
                }
            }
        }
        return arr;
    }
}
