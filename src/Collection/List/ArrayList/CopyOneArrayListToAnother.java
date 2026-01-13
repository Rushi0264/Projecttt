package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CopyOneArrayListToAnother {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");

        ArrayList<String> list1 = new ArrayList<>(list.size());
        for (int i=0;i<list.size();i++){
            list1.add(null);
        }

        Collections.copy(list1,list);

        System.out.println("Original ArrayList : "+list);
        System.out.println("Copied ArrayList : "+list1);

    }
}
