package util.ArrayListTest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

    @Test
    public void foreach() {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        String[] strings = new String[2];
        strings[0] = "111";

        // list1.forEach(System.out::print);

        List<Object> l = new ArrayList<>(Arrays.asList("foo", "bar"));

        // Arrays.asList("foo", "bar").toArray() produces String[],
        // and l is backed by that array

        l.set(0, new Object()); // Causes ArrayStoreException, because you cannot put
        // arbitrary Object into String[]


        //这个也是同理的 integer 也会出问题  这个是一个 bug
        List str = Arrays.asList(1,2);
        // class [Ljava.lang.Integer;
        System.out.println(str.toArray().getClass());
    }
}
