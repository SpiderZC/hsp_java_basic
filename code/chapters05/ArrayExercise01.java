public class ArrayExercise01 {
    public static void main(String[] args) {
        char[] letter = new char[26];

        for (int i = 0; i < letter.length; i++) {
            letter[i] = (char) ('A' + i);
        }

        for (int i = 0; i < letter.length; i++) {
            System.out.print(letter[i] + "\t");
        }
    }
}
