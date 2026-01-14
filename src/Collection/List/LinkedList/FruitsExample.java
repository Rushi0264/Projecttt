package Collection.List.LinkedList;

import java.util.LinkedList;

public class FruitsExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Pineapple");
        fruits.add("Litchi");
        System.out.println("List of fruits before update : "+fruits);

        fruits.set(0,"Blueberry");

        System.out.println("List of fruits after update ");
        for (String s : fruits) {
            System.out.println(" "+s);
        }
    }
}
