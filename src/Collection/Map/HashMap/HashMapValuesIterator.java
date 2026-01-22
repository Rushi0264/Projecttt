package Collection.Map.HashMap;

import java.util.HashMap;

public class HashMapValuesIterator {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(11,"Rushi");
        studentMap.put(12,"Avinash");
        studentMap.put(13,"Omkar");
        studentMap.put(14,"Shubham");
        studentMap.put(15,"Gaurav");

        for (String s : studentMap.values()){
            System.out.println(s);
        }
    }
}
