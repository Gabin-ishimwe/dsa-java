package folder;

import java.util.Arrays;

public class Recursion {
    public int factorialImpl(int num) {
        if(num == 0) return 1;
        return num * factorialImpl(num - 1);
    }

    public void mergeSort(int[] arr) {
        // base case
        if(arr.length <= 1) return; // break

        // divide the arr
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        // copy element in the sub arrays
        // copy to the left array
        for(int i = 0; i < leftSize; i ++) {
            leftArr[i] = arr[i];
        }

        // copy to the right array
        for(int i = leftSize; i < arr.length; i++) {
            rightArr[i - leftSize] = arr[i];
        }
        // call the mergeSort method on the sub arrays created
        mergeSort(leftArr);
        mergeSort(rightArr);
        // call the merge method which will merge the sub arrays
        merge(leftArr, rightArr, arr);



    }

    private void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
            // iter for left array
        int l = 0,
                // iter for right array
                r = 0,
                // iter for main array
                k = 0;

        while (l < leftSize && r < rightSize) {
            if(leftArr[l] < rightArr[r]) {
                arr[k] = leftArr[l];
                l++;
            } else {
                arr[k] = rightArr[r];
                r++;
            }
            k++;
        }

        // remaining element in left array
        while(l < leftSize) {
            arr[k] = leftArr[l];
            l++;
            k++;
        }

        // remaining element in right array
        while(r < rightSize) {
            arr[k] = rightArr[r];
            r++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int start, int end) {
        if(end <= start) return;
        int pivotIndex = partition(arr, start, end - 1);
        // quickSort first half of the arr
        quickSort(arr, start, pivotIndex - 1);
        // quickSort second half of the arr
        quickSort(arr, pivotIndex + 1, arr.length - 1);
    }

    private int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivotEl = arr[end];
        for (int j = start; j < end; j++) {
            if(arr[j] <= pivotEl) {
                // swap
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // change pivot position
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = pivotEl;
        arr[end] = temp;

        // assign new pivot
        return end + 1;
    }
}
