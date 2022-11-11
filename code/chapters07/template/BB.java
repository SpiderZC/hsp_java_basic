package template;

public class BB extends Template {
    @Override
    public void job() {
        long num = 0;
        for (long i = 1; i < 80000; i++) {
           num += i;
        }
        System.out.println("BB num is " + num);
    }
}
