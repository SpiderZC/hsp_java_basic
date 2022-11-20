package syn;

public class SellTicket extends Thread {

    private static int tickets = 100;

    public void run() {
        synchronized (this) {
            for(; tickets >= 0; tickets--) {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + ": 卖票, 还剩" + tickets);
                } catch (Exception e){
                    e.getMessage();
                }
            }
        }
    }
}
