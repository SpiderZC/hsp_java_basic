package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        Dog dog1 = new Dog("来福", 3);
        Dog dog2 = new Dog("小白", 4);
        Dog dog3 = new Dog("滚滚", 1);

        List<Dog> list = new ArrayList<>();
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);

        // Iterator<Dog> iterator = list.iterator();
        // while(iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        for (Dog dog : list) {
            System.out.println(dog);
        }
    }
}
