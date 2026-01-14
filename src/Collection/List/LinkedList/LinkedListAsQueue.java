package Collection.List.LinkedList;
//Write a Java program to use LinkedList as Queue.

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);

        System.out.println(qu.poll());
        System.out.println(qu.peek());
        System.out.println(qu);
    }
}
