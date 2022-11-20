package threaduse;

public class ThreadTest extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ", cat: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
