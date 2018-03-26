package util.HashMapTest;

import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    //init map
    @Test
    public void init() {
        // HashMap<String, String> map = new HashMap<String, String>(18, 0.45f);
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 24; i++) {
            map.put("1"+i,"1");
        }
        map.put("1","1");
        map.put("1","1");
        map.put("1","1");
        System.out.println( Integer.toBinaryString(32));
    }
}
