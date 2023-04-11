package folder;

import java.util.LinkedList;

public class LinkedListSingly {
    public void singlyListImpl() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        /*
        * we can use a linkedlist to mimic a stack
        * */
//        linkedList.push(1);
//        linkedList.push(4);
//        linkedList.push(3);
//        linkedList.push(2);
//        linkedList.pop();

        /*
        * we can use a linkedlist to mimic a queue
        * */
        linkedList.offer(1);
        linkedList.offer(5);
        linkedList.offer(4);
        linkedList.offer(3);
//        linkedList.poll();
        linkedList.add(3, 10);
        linkedList.remove(1);
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
    }
}
