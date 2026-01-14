package Collection.List.LinkedList;
//Write a Java program to demonstrate LinkedList acting as Deque.


import java.util.Deque;
import java.util.LinkedList;

public class LinkedListActAsDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.addLast(40);
        dq.addFirst(5);
        System.out.println(dq);
    }
}
