package folder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public void queueImpl() {
        LinkedList<String> listQueue = new LinkedList<>();
        listQueue.add("gabin");
        listQueue.add("ishimwe");
        listQueue.add("alain");
        listQueue.add("shema");
        listQueue.remove();
        listQueue.remove();

        /*
         * add method == enqueue operation == offer method
         * remove method == dequeue operation == poll method
         * N.B: Queue is an interface so we can't instantiate it
         * we need a class that implements this interface to use it
         * */
        String top = listQueue.peek();
        listQueue.offer("gabin");
        listQueue.poll();
        System.out.println(top);
        System.out.println(listQueue);
    }

    public void priorityQueueImpl() {
        /*
        * remove element according to their priority
        * in this case is ascending
        * */
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(1);
        queue.add(10);
        queue.add(9);
        queue.add(12);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
