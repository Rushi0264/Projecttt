package Collection.Map.HashMap;

import java.util.HashMap;

public class HashMapClear {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Omkar");
        map.put(102,"Rushi");
        map.put(103,"Sumit");
        map.put(104,"Shubham");
        map.put(105,"Ajay");
        //System.out.println(map);
        map.clear();
        System.out.println("Hashmap after clear : "+map);
        System.out.println("Check isEmpty : "+map.isEmpty());
    }
}
