package demo.collections.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Load {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.peek();

        deque.offerFirst("One");

        deque.offer("Three");

        deque.offerLast("Two");
        //deque.offer(null);
        System.out.println(deque.pollLast());
        for(String s : deque){
            System.out.println("s = " + s);
        }
    }
}
