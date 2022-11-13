package homework04;

public class HomeWork04 {
    public static void main(String[] args) {
        new Cellphone().testWork(new Calculator() {
            @Override
            public void work() {
                System.out.println("test cal");
            }
        });
    }
}

interface Calculator {
    void work();
}

class Cellphone {
    public void testWork(Calculator calculator) {
        calculator.work();
    }
}
