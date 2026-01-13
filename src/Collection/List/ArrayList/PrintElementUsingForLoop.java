package Collection.List.ArrayList;

import java.util.ArrayList;

public class PrintElementUsingForLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");

        for (int i=0;i< list.size();i++){
            System.out.println("Element st index "+i+" : "+list.get(i));
        }
    }
}
