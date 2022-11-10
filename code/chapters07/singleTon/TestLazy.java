package singleTon;

public class TestLazy {
    public static void main(String[] args) {
        Cat dd = Cat.getInstance();
        System.out.println(dd);
        
        Cat dd2 = Cat.getInstance();
        System.out.println(dd2);
    }
}

class Cat {

    private static Cat cat;

    private Cat() {
    }

    public static Cat getInstance() {
        if (cat == null) {
            cat =  new Cat();
        }

        return cat;
    }

}
