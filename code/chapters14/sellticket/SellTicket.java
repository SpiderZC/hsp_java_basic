package sellticket;

public class SellTicket extends Thread {

    private static int tickets = 100;

    public void run() {
        for(; tickets >= 0; tickets--) {
            System.out.println("SellTicket: 卖票, 还剩" + tickets);
        }
    }
}
