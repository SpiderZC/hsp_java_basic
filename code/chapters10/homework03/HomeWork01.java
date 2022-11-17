package homework03;

public class HomeWork01 {
    public static void main(String[] args) {
        String str = "fedcba";
        try {
            System.out.println(reverse(str, -1, str.length()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end) {
        if (!(str == null && start > end && start > 0 && end < str.length())) {
            throw new RuntimeException("参数错误");
        }
        char[] rchar = str.toCharArray();
        char temp = ' ';
        for(int i = start, j = end - 1; i <= j; i++, j--) {
            temp = rchar[i];
            rchar[i] = rchar[j];
            rchar[j] = temp;
        }
        return new String(rchar);
    }
}
