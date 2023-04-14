import folder.*;

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

        BST bst = new BST();
        bst.bstImpl();
        bst.bubbleSort();
        bst.selectionSort();
        bst.insertionSort();

    }
}