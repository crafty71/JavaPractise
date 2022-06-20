package MapPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("¹ù¾¸", "»ÆÈØ");
        map.put("Ñî¹ı", "Ğ¡ÁúÅ®");
        map.put("Áîºü³å", "ÈÎÓ¯Ó¯");
        System.out.println(map);
        System.out.println(map.get("¹ù¾¸"));

        Set<String> keystone = map.keySet();
        for(String key : keystone) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for(Map.Entry<String, String> item : entrySet) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
