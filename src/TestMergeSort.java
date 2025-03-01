public class TestMergeSort {
    int[] arr;
    public TestMergeSort(int[] arrToSort){
        this.arr = arrToSort;
    }

    public int[] sortArray(){
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length-1);

        return arr;
    }

    private int[] sort(int[] arr, int[] aux, int lo, int hi){
        if(hi <= lo){
            return arr;
        }

        int mid = lo + (hi - lo)/2;
        sort(arr, aux, lo, mid);
        sort(arr, aux, mid+1, hi);
        merge(arr, aux, lo, mid, hi);

        return arr;
    }

    private int[] merge(int[] arr, int[] aux, int lo, int mid, int hi){
        for(int i=lo ; i<= hi; i++){
            aux[i] = arr[i];
        }

        System.out.println("lo: "+lo+ " mid: "+mid + " hi: "+hi);
        int i = lo;
        int j = mid + 1;

        for(int k = lo; k <= hi; k++){
            if(i > mid){
                arr[k] = aux[j++];
            } else if(j > hi){
                arr[k] = aux[i++];
            } else if(aux[i] > aux[j]){
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 3, 4};
        TestMergeSort mergeSort = new TestMergeSort(arr);
        mergeSort.sortArray();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}