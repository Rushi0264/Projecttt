package Collection.List.LinkedList;
//Write a Java program to remove elements from first and last position of a LinkedList.

import java.util.LinkedList;

public class RemoveElementsFromFirstAndLast {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before update : "+list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After update : "+list);
        //System.out.println(list.contains(10));
    }
}
