package Collection.Map.HashMap;

import java.util.HashMap;

public class HashMapEmptyCheck {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        //map.put(102,"Om");

        if (map.isEmpty()){
            System.out.println("Map is empty");
        }else {
            System.out.println(map);
        }

        map.put(102,"Om");
        System.out.println(map.isEmpty());
    }
}
