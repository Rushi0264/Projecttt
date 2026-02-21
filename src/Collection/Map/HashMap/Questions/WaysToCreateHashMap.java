package Collection.Map.HashMap.Questions;

import java.util.HashMap;

public class WaysToCreateHashMap {
    public static void main(String[] args) {
        //1. Create empty hashmap with default initial capacity
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        //2. Create empty hashmap with default load factor and 30 initial capacity
        HashMap<String, Integer> hashMap2 = new HashMap<>(30);

        //3. Create empty hashmap with 30 as initial capacity and load factor is 0.5f
        HashMap<String, Integer> hashMap3 = new HashMap<>(30,0.5f);

        //4. create hashmap by copying all mapping from another hashmap
        HashMap<String, Integer> hashMap4 = new HashMap<>(hashMap1);
    }
}
