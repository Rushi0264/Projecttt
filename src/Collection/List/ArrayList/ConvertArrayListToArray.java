package Collection.List.ArrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Pineapple");

        String[] arr = list.toArray(new String[0]);
        System.out.print("Array Elements :");
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
