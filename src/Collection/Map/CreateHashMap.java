package Collection.Map;

import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101,"Rushi");
        hashMap.put(102,"Om");
        hashMap.put(103,"Sumit");

        for(String s : hashMap.values()){
            System.out.println(s);
        }
    }
}
