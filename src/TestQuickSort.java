public class TestQuickSort {
    // Partition first and then recursive traverse the array
    int[] arr = new int[10];

    public TestQuickSort(int[] arrToSort){
        this.arr = arrToSort;
    }

    public void sortArray(){
        sort(0, arr.length-1);
    }

    public void sort(int lo, int hi){
        if(hi<=lo) return;
        
        int k = partition(arr, lo, hi);
        sort(lo, k-1);
        sort(k+1, hi);
    }

    public int partition(int[] arr, int lo, int hi){
        int i = lo;
        int j = hi+1;


        while(true){
            while(arr[++i]<arr[lo])
                if(i>=hi) break;

            while(arr[--j]>arr[lo])
                if(j<lo) break;

            if(i>=j) break;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            
        }
        int temp = arr[j];
        arr[j] = arr[lo];
        arr[lo] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 3, 4};
        TestQuickSort quickSort = new TestQuickSort(arr);
        quickSort.sortArray();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
