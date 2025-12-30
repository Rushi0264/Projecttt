package Collection.List.ArrayList;

import java.util.ArrayList;

public class ClearAllElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        System.out.println("Before clear list : "+list);
        list.clear();
        System.out.println("After clear list : "+list);
    }
}
