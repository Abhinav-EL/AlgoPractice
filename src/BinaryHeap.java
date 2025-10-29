/*
 * Critical data structure for priority queue
 * 1. Insert: Add the value at the end of array and then swim up according to violation check]
 * 2. Delete: Swap the root with last value and sink the new root according to violation check
 * 3. Swim: Traverse up the tree and swap the value with parent if it violates the heap property
 * 4. Sink: Traverse down the tree and swap the value with child if it violates the heap property
 * 5. Get: Binary search to get the value from the heap
 * 
 * Parent = k/2
 * Child = 2k, 2k+1
 * 
 */

public class BinaryHeap {
    int[] arr = new int[9];
    int maxPosition = 0;

    public int[] currentArray(){
        return arr;
    }

    /**
     * Insert the value at the end of array and then swim up according to violation check
     */
    public void insert(int k){
        arr[++maxPosition] = k;
        swim(maxPosition);

    }

    /**
     * Swap the root with last value and sink the new root according to violation check
     * @return
     */
    public int delete(){
        int root = arr[1];
        SortUtil.swap(arr, 1, maxPosition--);
        arr[maxPosition+1] = 00; // important to actually remove the value
        sink(1);
        return root;
    }

    public void swim(int k){
        while(k>1 && SortUtil.smaller(arr[k/2], arr[k])){
            SortUtil.swap(arr, k, k/2);
            k=k/2; //traverse up the tree
        }
    }

    public void sink(int k){
        if(k>=maxPosition)
            return;
        if(SortUtil.smaller(arr[k], arr[2*k])){
            SortUtil.swap(arr, k, 2*k);
            sink(2*k); //traverse down the tree
        } else if(SortUtil.smaller(arr[k], arr[2*k+1])){
            SortUtil.swap(arr, k, 2*k+1);
            sink(2*k+1); //traverse down the tree
        }
    }

    public Integer get(Integer val){
        int lo = 0, hi = arr.length-1;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int cmp = val.compareTo(arr[mid]);
            if(cmp>0) hi = mid - 1;
            else if(cmp < 0) lo = mid + 1;
            else return arr[mid];
        }
        return null;
    }
}
