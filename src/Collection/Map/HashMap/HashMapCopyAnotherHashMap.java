package Collection.Map.HashMap;

import java.util.HashMap;

public class HashMapCopyAnotherHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Omkar");
        map.put(102,"Rushi");
        map.put(103,"Sumit");
        map.put(104,"Shubham");
        map.put(105,"Ajay");

        HashMap<Integer,String> newMap = new HashMap<>();
        newMap.putAll(map);

        System.out.println(newMap);
        System.out.println(map);
    }
}
