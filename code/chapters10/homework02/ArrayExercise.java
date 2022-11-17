package homework02;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new Book("红楼梦", 130);
        book[1] = new Book("新三国演义", 190);
        book[2] = new Book("西游", 120);
        book[3] = new Book("新水浒传", 110);

        Arrays.sort(book, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double price = (double) (book1.getPrice() - book2.getPrice());
                if (price > 0) {
                    return -1;
                } else if (price < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(Arrays.toString(book));
    }
}
