package threaduse;

public class TestMain {
    public static void main(String[] args) {
        ThreadTest threadtest = new ThreadTest();
        threadtest.start();
        ThreadTest threadtest2 = new ThreadTest();
        threadtest2.start();
    }
}
