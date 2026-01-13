package Collection.List.ArrayList;

import java.util.ArrayList;

public class PrintElementUsingEnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");

        for (String s : list){
            System.out.println(s);
        }
    }
}
