import folder.*;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Stacks run =new Stacks();
//        run.tryouts();
//        Queues queues = new Queues();
//        queues.queueImpl();
//        queues.priorityQueueImpl();

//        LinkedListSingly linkedListSingly = new LinkedListSingly();
//        linkedListSingly.singlyListImpl();

//        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.arrayImpl();

//        BST bst = new BST();
//        bst.bstImpl();
//        bst.bubbleSort();
//        bst.selectionSort();
//        bst.insertionSort();

        Recursion recursion = new Recursion();
        System.out.println(recursion.factorialImpl(4));
        recursion.mergeSort(new int[]{5, 1, 7, 2, 4, 9});
        int[] arr = {5, 1, 7, 2, 4, 9};
        recursion.quickSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}