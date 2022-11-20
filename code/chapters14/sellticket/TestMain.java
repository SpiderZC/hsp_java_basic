package sellticket;

public class TestMain {
    public static void main(String[] args) {
        // SellTicket sellTicket = new SellTicket();
        // sellTicket.start();
        // SellTicket sellTicket2 = new SellTicket();
        // sellTicket2.start();
        // SellTicket sellTicket3 = new SellTicket();
        // sellTicket3.start();
        SellTicket2 sellTicket2 = new SellTicket2();
        Thread thread = new Thread(sellTicket2);
        thread.start();
        Thread thread2 = new Thread(sellTicket2);
        thread2.start();
        Thread thread3 = new Thread(sellTicket2);
        thread3.start();
    }
}
