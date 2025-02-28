package com.test.app;

public class SortMain {

    public static void main(String[] args) {
        /*
        To test if the utility methods are working

        int[] arr = {1, 2};
        printArray(arr);
        SortUtil.swap(arr, 0, 1);
        printArray(arr);*/

        /*System.out.println("*** Selection Sort ***");
        // 1. Initialize implementation
        SelectionSort selectionSort = new SelectionSort();
        // 2. Print current array
        printArray(selectionSort.currentArray());
        // 3. Now actually sort
        selectionSort.sortArray();
        // 4. Print sorted array
        printArray(selectionSort.currentArray());*/

        /*System.out.println("*** Insertion Sort ***");
        // 1. Initialize implementation
        InsertionSort insertionSort = new InsertionSort();
        // 2. Print current array
        printArray(insertionSort.currentArray());
        // 3. Now actually sort
        insertionSort.sortArray();
        // 4. Print sorted array
        printArray(insertionSort.currentArray());*/

        /*System.out.println("*** Shell Sort ***");
        // 1. Initialize implementation
        ShellSort shellSort = new ShellSort();
        // 2. Print current array
        printArray(shellSort.currentArray());
        // 3. Now actually sort
        shellSort.sortArray();
        // 4. Print sorted array
        printArray(shellSort.currentArray());*/

        /*System.out.println("*** Assignment Shell Sort ***");
        // 1. Initialize implementation
        TestAssignmentShellString testAssignment = new TestAssignmentShellString();
        // 2. Print current array
        testAssignment.printArray();
        // 3. Now actually sort
        testAssignment.sortArray();
        // 4. Print sorted array
        testAssignment.printArray();*/

        System.out.println("*** Merge Sort ***");
        // 1. Initialize implementation
        MergeSort mergeSort = new MergeSort();
        // 2. Print current array
        printArray(mergeSort.currentArray());
        // 3. Now actually sort
        mergeSort.sortArray();
        // 4. Print sorted array
        printArray(mergeSort.currentArray());

        /*System.out.println("*** MergeBU Sort ***");
        // 1. Initialize implementation
        MergeSortBottomUp mergeSortBottomUp = new MergeSortBottomUp();
        // 2. Print current array
        printArray(mergeSortBottomUp.currentArray());
        // 3. Now actually sort
        mergeSortBottomUp.sortArray();
        // 4. Print sorted array
        printArray(mergeSortBottomUp.currentArray());*/

        /*System.out.println("*** Merge Sort Test Assignment ***");
        // 1. Initialize implementation
        TestAssignmentSortedSubArray testAssignmentSortedSubArray = new TestAssignmentSortedSubArray();
        // 2. Print current array
        printArray(testAssignmentSortedSubArray.currentArray());
        // 3. Now actually sort
        testAssignmentSortedSubArray.sortArray();
        // 4. Print sorted array
        printArray(testAssignmentSortedSubArray.currentArray());*/

        /*System.out.println("*** Binary Heap ***");
        // 1. Initialize implementation
        BinaryHeap binaryHeap = new BinaryHeap();
        // 2. Print current array
        printArray(binaryHeap.currentArray());
        // 3. Now actually insert values
        binaryHeap.insert(30);
        binaryHeap.insert(20);
        binaryHeap.insert(50);
        binaryHeap.insert(10);
        binaryHeap.insert(40);
        // 4. Print current array
        printArray(binaryHeap.currentArray());
        // 5. delete max
        System.out.println("Delete val: "+binaryHeap.delete());
        // 6. Print current array
        printArray(binaryHeap.currentArray());*/

        /*System.out.println("*** Heap Sort ***");
        // 1. Initialize implementation
        HeapSort heapSort = new HeapSort();
        // 2. Print current array
        //printArray(heapSort.currentArray());
        // 3. Now actually sort
        heapSort.sortArray();
        // 4. Print sorted array
        printArray(heapSort.currentArray());*/

        /*System.out.println("*** Quick Sort ***");
        // 1. Initialize implementation
        QuickSort quickSort = new QuickSort();
        // 2. Print current array
        printArray(quickSort.currentArray());
        // 3. Now actually sort
        quickSort.sortArray();
        // 4. Print sorted array
        printArray(quickSort.currentArray());*/

        /*System.out.println("*** Binary Search ***");
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.getKey(50) == 4);
        System.out.println(binarySearch.getKey(70) == 6);
        System.out.println(binarySearch.getKey(170) == 6);*/

        /*BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.prepBST(binarySearchTree);
        System.out.println("Get 5th value: " + binarySearchTree.get(5));
        System.out.println("Get 0th value: " + binarySearchTree.get(0));
        System.out.println("Get 7th value: " + binarySearchTree.get(7));*/

        /*HashTable hashTable = new HashTable();
        hashTable.put(4, "A");
        hashTable.put(3, "X");
        hashTable.put(2, "M");
        hashTable.put(5, "Y");
        hashTable.put(6, "D");
        hashTable.put(7, "F");

        System.out.println(""+hashTable.get(4));
        System.out.println(""+hashTable.get(3));
        System.out.println(""+hashTable.get(2));
        System.out.println(""+hashTable.get(5));
        System.out.println(""+hashTable.get(6));
        System.out.println(""+hashTable.get(7));*/
    }

    /**
     * Just print the array being passed
     * @param arr
     */
    private static void printArray(int[] arr){
        System.out.println("--- Printing Array --- ");
        for(int i =0; i<arr.length; i++){
            System.out.println("position: "+i + " value: "+arr[i]);
        }
    }
}
