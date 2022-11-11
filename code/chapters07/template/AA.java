package template;

public class AA extends Template {

    @Override
    public void job() {
        long num = 1;
        for (long i = 1; i < 8; i++) {
           num *= i;
        }
        System.out.println("AA num is " + num);
    }
}
