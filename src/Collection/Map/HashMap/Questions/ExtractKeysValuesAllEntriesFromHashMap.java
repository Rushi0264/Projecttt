package Collection.Map.HashMap.Questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//4) How do you extract a list of only keys or a list of only values or a list of all entries from a given HashMap?
public class ExtractKeysValuesAllEntriesFromHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIdName = new HashMap<>();
        studentIdName.put(101,"Omkar");
        studentIdName.put(102,"Rushi");
        studentIdName.put(103,"Avinash");
        studentIdName.put(104,"Sumit");
        studentIdName.put(105,"Shubham");

        //Extracting list of keys
        List<Integer> keyList = studentIdName.keySet().stream().toList();
        System.out.println("List : "+keyList);

        //Extracting list of values
        List<String> valueList = studentIdName.values().stream().toList();
        System.out.println("Values : "+valueList);

        //Extracting list of entries
        List<Map.Entry<Integer, String>> entries = studentIdName.entrySet().stream().toList();
        System.out.println("Entries : "+entries);
    }
}
