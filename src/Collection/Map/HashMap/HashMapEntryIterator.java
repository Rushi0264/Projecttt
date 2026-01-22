package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEntryIterator {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(11,"Rushi");
        studentMap.put(12,"Avinash");
        studentMap.put(13,"Omkar");
        studentMap.put(14,"Shubham");
        studentMap.put(15,"Gaurav");

        for (Map.Entry<Integer, String> entry : studentMap.entrySet()){
            System.out.println(entry);
        }

/*        Iterator itr = studentMap.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }
}
