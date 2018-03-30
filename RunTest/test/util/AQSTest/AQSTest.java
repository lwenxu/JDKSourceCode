package util.AQSTest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// test signal 执行后不会导致当前线程立即释放锁
public class AQSTest {
    static Lock lock = new ReentrantLock();
   static Condition run1Cond = lock.newCondition();
    static Condition run2Cond = lock.newCondition();

    static class Runner1 implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("runner 1 start");
                run1Cond.await(1, TimeUnit.SECONDS);
                run2Cond.signal();
                System.out.println("runner 1 exit");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }

    static class Runner2 implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("runner 2 start");
                run2Cond.await();
                System.out.println("runner 2 exit");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }
    }
    public static void main(String[] args) {
        new Thread(new Runner1(),"runner1").start();
        new Thread(new Runner2(),"runner2").start();
    }
}
