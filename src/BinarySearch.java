

/**
 * BinaryHeap based implementation based on sorted array
 * Here its treating the initial mid as the root of the tree...
 * The left child is smaller than the right child - Both children are smaller than the parent
 */
public class BinarySearch {
    Integer[] arr = {00, 10 ,30 ,40 ,50 ,60 , 70};

    public Integer[] currentArray(){
        return arr;
    }

    public int getKey(Integer key){
        int lo =0; int hi = arr.length -1;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int cmp = key.compareTo(arr[mid]);
            if(cmp < 0) hi = mid -1;
            else if (cmp >0) lo = mid +1;
            else return mid;
        }

        return lo;
    }

}
