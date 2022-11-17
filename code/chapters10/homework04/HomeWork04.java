package homework04;

public class HomeWork04 {
    public static void main(String[] args) {
        String name = "abcef";
        try {
            userRegister(name, "0", "0");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String passwd, String email) {
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名长度为2到4");
        }
        System.out.println(name);
    }
}
