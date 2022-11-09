public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};

        int[] arr2 = new int[arr.length + 1];

        int insertNumber = 23;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (insertNumber <= arr[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            index = arr.length;
        }

        for (int i = 0, j = 0; i < arr2.length; i++) {
            if (i != index) {
                arr2[i] = arr[j];
                j++;
            } else {
                arr2[i] = insertNumber;
            }
        }

        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
