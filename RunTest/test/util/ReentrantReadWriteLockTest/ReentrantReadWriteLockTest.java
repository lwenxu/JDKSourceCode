package util.ReentrantReadWriteLockTest;

import org.junit.Test;

public class ReentrantReadWriteLockTest {
    // 高16位表示当前读锁的占有量，低16位表示写锁的占有量
    static final int SHARED_SHIFT   = 16;
    static final int SHARED_UNIT    = (1 << SHARED_SHIFT);
    static final int MAX_COUNT      = (1 << SHARED_SHIFT) - 1;
    static final int EXCLUSIVE_MASK = (1 << SHARED_SHIFT) - 1;
    static int sharedCount(int c)    { return c >>> SHARED_SHIFT; }
    static int exclusiveCount(int c) { return c & EXCLUSIVE_MASK; }

    public static void main(String[] args) {
        System.out.println(sharedCount(1000000));
    }
    @Test
    public void shift() {

        System.out.println(1>>>16);
    }
}
