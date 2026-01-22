package Collection.Map.HashMap;

import java.util.HashMap;

public class HashMapPrintOnlyValues {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(11,"Rushi");
        studentMap.put(12,"Avinash");
        studentMap.put(13,"Omkar");
        studentMap.put(14,"Shubham");
        studentMap.put(15,"Gaurav");

        //System.out.println(studentMap.values());

        for (String s : studentMap.values()){
            System.out.println(s);
        }
    }
}
