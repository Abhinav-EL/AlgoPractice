/**
 * Makes use of binary heap algorithm
 * - with NlogN “in place” sorting (no extra array)
 * - better than MergeSort and QuickSort, but it does lot of long exchanges
 *
 * Sort plan is
 * - 1) Construct the heap with max-heap implementation (i.e parent is larger than children)
 * - 2) For sorting repeatedly delete the root using BinaryHeap strategy and sink the new root
 */
public class HeapSort {
    int[] arr = {10, 40, 50, 60, 30, 90, 70, 00 , 20, 80, 110, 00};

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        //Step 1
        for(int i =arr.length/2 ; i >=0; i--){
            //This takes care of one/half sorting the array
            sink(i, arr.length);
        }

        //Step 2
        int currSize = arr.length-1;
        while(currSize>0){
            SortUtil.swap(arr, 0, currSize);
            sink(0, --currSize);
        }
        return arr;
    }

    private void sink(int k, int len){
        while(2*k<len){
            int j = 2*k;
            if(j<len && SortUtil.smaller(arr[j], arr[j+1])) j++;
            if(!SortUtil.smaller(arr[k], arr[j])) break;
            SortUtil.swap(arr, k, j);
            k = j;
        }
    }

}
