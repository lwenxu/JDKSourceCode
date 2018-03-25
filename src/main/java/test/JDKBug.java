package test;

import org.junit.Test;

class A{

}

class B extends A{

}

public class JDKBug {

    @Test
    public void test1() {
        B[] arrB = new B[10];
        A[] arrA = arrB;
        arrA[0]=new A();
    }
}
