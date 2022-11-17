package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 10));
        list.add(new Book("水浒传", "施耐庵", 9));
        list.add(new Book("三国志", "罗贯中", 80));
        list.add(new Book("西游记", "吴承恩", 10));

        for (Book book : list) {
            System.out.println(book);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book = list.get(j);
                Book book2 = list.get(j + 1);

                if (book.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book);
                }
            }
        }

        System.out.println("====================");

        for (Book book : list) {
            System.out.println(book);
        }

    }
}
