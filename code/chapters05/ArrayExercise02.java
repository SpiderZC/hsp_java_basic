public class ArrayExercise02 {
    public static void main(String[] args) {
        int[] numbers = {4, -1, 9, 10, 23};
        int index = 0;
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("the max is: " + max + ";\nthe index is " + index + ";");
    }
}
