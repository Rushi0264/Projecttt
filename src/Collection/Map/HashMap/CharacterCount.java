package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Java J2EE Java JSP J2EE";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()){
            if (charCountMap.containsKey(ch)){
                charCountMap.put(ch, charCountMap.get(ch)+1);
            }else {
                charCountMap.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
