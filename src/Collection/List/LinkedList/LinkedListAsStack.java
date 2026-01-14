package Collection.List.LinkedList;
//Write a Java program to use LinkedList as Stack.

import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
