public class HomeWork05 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};

        int[] arrNew = new int[arr.length + 1];

        int insertNum = 3;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (insertNum < arr[i]) {
                arrNew[index] = insertNum;
                for (int j = 0; j < arr.length; j++) {
                    index++;
                    arrNew[index] = arr[j];
                }
                break;
            }
            index++;
            arrNew[index] = arr[i];
            if (insertNum > arr[arr.length - 1]) {
                arrNew[arrNew.length - 1] = insertNum;
            } else if (insertNum > arr[i] && insertNum <= arr[i + 1]) {
                arrNew[index] = insertNum;
                index++;
            }
        }

        arr = arrNew;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
