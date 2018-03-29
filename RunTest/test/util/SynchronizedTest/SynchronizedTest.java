package util.SynchronizedTest;

public class SynchronizedTest {
    public static void main(String[] args) {
        synchronized (SynchronizedTest.class) {
            System.out.println("hello");
        }
    }

    public static synchronized void test(){

    }
}
