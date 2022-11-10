package singleTon;

public class TestHungry {

    public static void main(String[] args) {
        GirlFriend dd = GirlFriend.getInstance();
        System.out.println(dd);

        GirlFriend dd2 = GirlFriend.getInstance();
        System.out.println(dd2);

        System.out.println(dd == dd2);
    }
}

class GirlFriend {

    private String name;

    private static GirlFriend gf = new GirlFriend("Spider");

    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "TestHungry [" + name + "]";
    }
}
