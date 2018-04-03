package util.CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch1 = new CountDownLatch(1);
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                try {
                    latch1.await();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        System.out.println("main must done something !");
        Thread.sleep(1000);
        latch1.countDown();
    }
}
