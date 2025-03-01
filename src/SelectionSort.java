
/**
 * Selection sort is the elementary sort where each element
 * is compared to current element and if found to
 * be smaller value, swapped. Takes O(n^2) time.
 */
public class SelectionSort {
    int[] arr;

    public SelectionSort(int[] arrToSort){
        this.arr = arrToSort;
    }

    public int[] currentArray(){
        return arr;
    }

    public int[] sortArray(){
        for (int i = 0; i< arr.length; i++){
            int min = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 3, 4};
        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.sortArray();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
