package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeIdNameMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Omkar");
        map.put(102,"Rushi");
        map.put(103,"Sumit");
        map.put(104,"Shubham");
        map.put(105,"Ajay");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry);
        }
    }
}
