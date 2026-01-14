package Collection.List.LinkedList;

//Write a Java program to demonstrate LinkedList acting as List.

import java.util.LinkedList;
import java.util.List;

public class LinkedListActingAsList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
    }
}
