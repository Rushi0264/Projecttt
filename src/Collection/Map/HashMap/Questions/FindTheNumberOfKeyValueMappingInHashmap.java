package Collection.Map.HashMap.Questions;
//6) How do you find out the number of key-value mappings present in a HashMap?

import java.util.HashMap;

public class FindTheNumberOfKeyValueMappingInHashmap {
    public static void main(String[] args) {
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        //Adding key-value pairs to map using put() method
        map.put(111, 111.111);
        map.put(222, 222.222);
        map.put(333, 333.333);
        map.put(444, 444.444);
        map.put(555, 555.555);
        map.put(666, 666.666);
        map.put(777, 777.777);

        System.out.println("Size of given map : "+map.size());
    }
}
