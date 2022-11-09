package dynamicbinding;

public class TestMain {
    public static void main(String[] args) {
        Father father = new Son();
        System.out.println(father.sum());
        System.out.println(father.sum1());
    }
}
