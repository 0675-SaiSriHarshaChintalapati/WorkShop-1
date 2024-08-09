package ArrayDifference;

import java.util.*;
public class GroupElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","bat","sky","feel", "good", "best", "a", "b");
        Map<Integer, List<String>> map=groupByLength(list);
        for(Map.Entry<Integer,List<String>>entry:map.entrySet()) {
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        Map<Integer, List<String>> map = new HashMap<>();
        for(String s : list) {
            int key = s.length();
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return map;
    }
}
