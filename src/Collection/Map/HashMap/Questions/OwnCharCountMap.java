package Collection.Map.HashMap.Questions;

import java.util.HashMap;
import java.util.Map;

public class OwnCharCountMap {
    public static void main(String[] args) {
        String str = "Hello Java";
        Map<Character, Integer> count = new HashMap<>();

        for (char ch : str.toCharArray()){
            if (count.containsKey(ch)){
                count.put(ch, count.get(ch)+1);
            }else {
                count.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
