package util.LinkedListTest;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void test(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.indexOf(1));
    }
}
