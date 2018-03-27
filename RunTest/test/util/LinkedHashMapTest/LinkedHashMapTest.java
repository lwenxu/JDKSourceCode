package util.LinkedHashMapTest;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    @Test
    public void test(){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, 1);
        map.put(4, 2);
        map.put(6, 3);
        map.put(5, 4);

        System.out.println(map.get(4));

        map.forEach((x,y)-> System.out.println(x +"---"+y));
    }
}
