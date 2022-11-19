package homework;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork03 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);

        hashMap.replace("jack", 2600);

        Set<Entry<String, Integer>> entries = hashMap.entrySet();

        for (Entry<String,Integer> entry : entries) {
            hashMap.replace(entry.getKey(), entry.getValue() + 100);
        }

        for (Entry<String,Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
