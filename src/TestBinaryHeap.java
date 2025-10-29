public class TestBinaryHeap {
    int[] arr;

    TestBinaryHeap(int[] input){
        //Starts at 1 instead of O.
        arr = new int[input.length+1];
        for(int i=0; i<input.length; i++){
            arr[i+1] = input[i];
        }
    }

    public void swim(int k){
        while(k>1 && arr[k]>arr[k/2]){
            int temp = arr[k];
            arr[k] = arr[k/2];
            arr[k/2] = temp;
            k = k/2;
        }
    }

    public void sink(int k){
        while(2*k<arr.length-1){
            int left = 2*k;
            if(arr[left]<arr[left+1])
                left++;
            if(arr[k]<arr[left]){
                int temp = arr[k];
                arr[k] = arr[left];
                arr[left] = temp;
                k = left;
            } else {
                break;
            }
        }
    }

    public void insert(int k){
        arr[arr.length-1] = k;
        swim(arr.length-1);
    }

    public int delete(){
        int root = arr[1];
        arr[1] = arr[arr.length-1];
        sink(1);
        return root;
    }

    public int[] getArray(){
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 6, 2, 4};
        TestBinaryHeap testBinaryHeap = new TestBinaryHeap(arr);
        for (int i : arr) {
            System.out.println("inserting: "+i);
            testBinaryHeap.insert(i);
        }

        for (int i : testBinaryHeap.getArray()) {
            System.out.println("Array after inserting: "+i);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(testBinaryHeap.delete());
        }
    }
}
