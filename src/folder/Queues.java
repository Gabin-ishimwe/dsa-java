package folder;

import java.util.LinkedList;

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
         *
         * */
        String top = listQueue.peek();
        listQueue.offer("gabin");
        listQueue.poll();
        System.out.println(top);
        System.out.println(listQueue);
    }
}
