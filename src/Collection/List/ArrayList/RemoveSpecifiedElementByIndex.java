package Collection.List.ArrayList;

import java.util.ArrayList;

public class RemoveSpecifiedElementByIndex {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
