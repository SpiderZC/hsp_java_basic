package homework05;

public class HomeWork05 {

    public static void main(String[] args) {
        printName("Han shun Ping");
    }

    public static void printName(String str) {
        if (str == null) {
            System.out.println("名字不能为空");
            return;
        }
        String[] names = str.split(" ");

        if (names.length != 3) {
            System.out.println("输入的字符串格式不正确");
        }

        String formats = String.format("%s,%s ,%c", names[2], names[0], names[1].toUpperCase().charAt(0));

        System.out.println(formats);
    }
}
