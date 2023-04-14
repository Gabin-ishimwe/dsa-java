package folder;

import java.util.Arrays;

public class BST {
    public void bstImpl() {
        int[] array = {1, 2,3 ,4};
        int target = 0;
        int low = 0; // index of first element
        int high = array.length - 1; // index of last element
        /*
        * this loop will stop if low is greater than high
        * because the element might be at the end of the array
        * so we need to iterate all over to the last element of the array
        * */
        while(low <= high) {
            int middle = (high + low) /2;
            System.out.println(middle);
            if(array[middle] > target) {
                high = middle - 1;
            } else if (array[middle] < target) {
                low = middle + 1;
            } else if (array[middle] == target) {
                System.out.println("Element found");
            } else {
                System.out.println("Element not found");
            }
        }
    }

    public void interpolationSearch() {
        /*
        * improvement of binary search
        * time complexity: O(log(log(n)))
        * worst case: O(n) [increasing exponentially]
        * */
    }

    public void bubbleSort() {
        int[] sortArr = {5, 1, 7, 2, 4, 9};
        for(int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j] > sortArr[j+1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = temp;
                }
            }
        }

        System.out.println("sorted array " + Arrays.toString(sortArr));
    }

    public void selectionSort() {
        int[] sortArr = {5, 1, 7, 2, 4, 9, 0, 15, 12, 17, 13, 19, 14};
        for(int i = 0; i < sortArr.length; i ++) {
            int min = i; // min current number
            for(int j = i + 1; j < sortArr.length; j++) {
                if(sortArr[min] > sortArr[j]) {
                    min = j;
                }
            }
            // swap elements
            int temp = sortArr[i];
            sortArr[i] = sortArr[min];
            sortArr[min] = temp;
        }
        System.out.println("sorted array " + Arrays.toString(sortArr));
    }

    public void insertionSort(){
        int[] sortArr = {5, 1, 7, 2, 4, 9, 0, 15, 12, 17, 13, 19, 14};
        for(int i = 1; i < sortArr.length; i ++) {
            int temp = sortArr[i];
            int j = i - 1;
            while(j >= 0 && sortArr[j] > temp) {
                // swap
                sortArr[j + 1] = sortArr[j];
                j--;
            }
            // remaining last opening
            sortArr[j + 1] = temp;
        }
        System.out.println("sorted array " + Arrays.toString(sortArr));
    }
}
