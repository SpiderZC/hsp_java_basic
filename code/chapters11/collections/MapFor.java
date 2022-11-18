package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapFor {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");


        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("=====================");
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("=====================");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("=====================");
        System.out.println("list.foreach");
        values.forEach(System.out::println);

        System.out.println("=====================");

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("=====================");
        Set<Entry<String, String>> set = map.entrySet();
        Iterator<Entry<String, String>> entryIterator = set.iterator();
        while (entryIterator.hasNext()) {
            System.out.println(entryIterator.next());
        }

        System.out.println("=====================");
        for (Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
