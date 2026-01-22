package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountryCapital {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("USA","Washington D.C.");
        map.put("UK","London");
        map.put("China","Beijing");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("Brazil","Brasília");
        map.put("Australia","Canberra");

        //System.out.println(map.entrySet());
        for (Map.Entry<String, String> s : map.entrySet()){
            System.out.println(s);
        }
    }
}
