package sellticket;

public class SellTicket2 implements Runnable {

    private static int tickets = 100;

    public void run() {
        for(; tickets >= 0; tickets--) {
            System.out.println("SellTicket2: 卖票, 还剩" + tickets);
        }
    }
}
