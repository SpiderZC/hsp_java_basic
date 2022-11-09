public class ArrayAdd {
    public static void main(String[] args) {
        int count = 3;
        int[] arr = {1, 2, 3};
        int[] arrAdd = new int[arr.length + count];
        for (int i = 0; i < arr.length; i++){
            arrAdd[i] = arr[i];
        }

        for (int i = arr.length - 1; i < arrAdd.length; i++) {
            arrAdd[arrAdd.length - count - 1] = i + 1;
            count--;
        }

        arr = arrAdd;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
