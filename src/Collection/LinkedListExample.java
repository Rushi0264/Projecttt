package Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(400);

        numbers.removeLast();
        System.out.println("Linked list : "+numbers);
    }
}
