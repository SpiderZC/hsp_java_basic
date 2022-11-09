package dynamicbinding;

public class Son extends Father{
    public int i = 20;
    public int sum() {
        return i + 20;
    }

    public int getI() {
        return i;
    }

    public int sum1() {
        return i + 10;
    }
}
