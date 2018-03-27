package util.ConcurrentHashMapTest;

import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
    @Test
    public void nullKey(){
        HashMap<String, String> hashMap = new HashMap<>();
        // hashMap.put("aa", null);
        // hashMap.put(null, null);
        System.out.println(hashMap.containsValue(null));
        System.out.println(hashMap.containsValue("bb"));
    }


    @Test
    public void addCount() {
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap();
        hashMap.put("1", "1");

    }
}
