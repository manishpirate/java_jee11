package demo.collections.Deque;

import java.util.*;

public class DoubleLinkedList {

    public static void main(String[] args) {
        Deque<String> doubleLinkedList = new LinkedList<>();
        doubleLinkedList.offerFirst("1");
        doubleLinkedList.offerFirst("2");
        doubleLinkedList.offer("3");
        doubleLinkedList.offer("4");

        doubleLinkedList.poll();
        doubleLinkedList.pollLast();




        System.out.println("doubleLinkedList = " + doubleLinkedList);
            
    }
}
