package Collection.Map.HashMap.Questions;

import java.util.HashMap;

//3) How do you check whether given key or value exist in a HashMap?
public class CheckGivenKeyAndValueExistingHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentIdName = new HashMap<>();
        studentIdName.put(101,"Omkar");
        studentIdName.put(102,"Rushi");
        studentIdName.put(103,"Avinash");
        studentIdName.put(104,"Sumit");
        studentIdName.put(105,"Shubham");

        //Check given key is present in hashmap or not
        System.out.println("Hashmap contains key 103 : "+studentIdName.containsKey(103));
        System.out.println("Hashmap contains key 107 : "+studentIdName.containsKey(107));

        //Check given value is present in hashmap or not
        System.out.println("Hashmap contains value Omkar : "+studentIdName.containsValue("Omkar"));
        System.out.println("Hashmap contains value Danish : "+studentIdName.containsValue("Danish"));

    }
}
