package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeDetails {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101,"Avinash");
        linkedHashMap.put(102,"Rushi");
        linkedHashMap.put(103,"Omkar");

        //System.out.println(linkedHashMap);

        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }
}
