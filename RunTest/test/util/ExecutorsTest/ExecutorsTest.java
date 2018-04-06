package util.ExecutorsTest;

public class ExecutorsTest {
    public static void main(String[] args) {
        String str = "";
        Thread t=new Thread(()->{
            synchronized (str) {
                try {
                    str.wait();
                    System.out.println("hello");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);
        t.start();
        System.out.println("main end");
    }
}
