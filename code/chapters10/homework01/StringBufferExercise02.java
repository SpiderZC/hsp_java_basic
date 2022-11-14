package homework01;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        String price = "8123564.59";
        StringBuffer sb = new StringBuffer(price);

        // int i = sb.lastIndexOf(".");
        // sb = sb.insert(i-3, ",");

        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
