package test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args){
        Map map = new TreeMap();
        map.put("1","A");
        map.put("3","B");
        map.put("2","C");
        System.out.println(map.toString());
        Map map1 = new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        map1.put("1","A");
        map1.put("3","B");
        map1.put("2","C");
        System.out.println(map1.toString());

    }
}
