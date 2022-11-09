public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66};
        int index = array.length - 1;
        int temp = 0;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[index - i];
            array[index - i] = temp;
        }

         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + "\t");
         }
    }
}
