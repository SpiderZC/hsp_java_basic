package enum_;

public class Enumeration2 {

    public static void main(String[] args) {
//        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.Boy);
    }
}

enum Season2 {
    // 1. 将构造器私有化、目的防止 直接new
    // 2. 去掉setXXX方法，防止被修改

    Boy();
    
//    SPRING("Spring"),
//    SUMMER("Summer"),
//    AUTUMN("Autumn"),
//    WINTER("Winter");

//    private String name;


//    private Season2(String name) {
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }

//    @Override
//    public String toString() {
//        return "Enumeration [" + name + "]";
//    }

}
