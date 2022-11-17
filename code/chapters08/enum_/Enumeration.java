package enum_;

public class Enumeration {


    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }

}

class Season {
    // 1. 将构造器私有化、目的防止 直接new
    // 2. 去掉setXXX方法，防止被修改

    private String name;

    public static Season SPRING = new Season("Spring");
    public static Season SUMMER = new Season("summer");
    public static Season AUTUMN = new Season("autumn");
    public static Season WINTER = new Season("winter");

    private Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Enumeration [" + name + "]";
    }

}
