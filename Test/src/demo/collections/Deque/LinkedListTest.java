package demo.collections.Deque;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");

        System.out.println("queue = " + queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.element());

        System.out.println(queue.poll());
        System.out.println("queue = " + queue);
    }

}
