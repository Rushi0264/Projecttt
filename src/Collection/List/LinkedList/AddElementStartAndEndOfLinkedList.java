package Collection.List.LinkedList;
//Write a Java program to add elements at the beginning and end of a LinkedList.

import java.util.LinkedList;

public class AddElementStartAndEndOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before update : "+list);

        list.addFirst(5);
        list.addLast(60);
        System.out.println("After update : "+list);
    }
}
