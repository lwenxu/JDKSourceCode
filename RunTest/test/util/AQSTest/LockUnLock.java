package util.AQSTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUnLock {
    static Lock lock = new ReentrantLock();
    static Condition cond1 = lock.newCondition();
    static Condition cond2 = lock.newCondition();

    public static void main(String[] args) {
        new Thread(()->{
            lock.lock();
            System.out.println("sss");
            lock.unlock();
        }).start();

        new Thread(()->{
            lock.lock();
            System.out.println("Tttt");
            lock.unlock();
        }).start();
    }
}
