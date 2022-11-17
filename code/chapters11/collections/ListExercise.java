package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");

        System.out.println("=====================");


        int cout = 1;
        for (String string : list) {
            System.out.print(cout++ + "." + string + "\t");
        }

        System.out.println("\n=====================");
        list.add(1, "spider");

        System.out.println(list.get(4));

        System.out.println("=====================");

        list.remove(5);

        list.set(6, "更换");
        cout = 1;
        for (String string : list) {
            System.out.println(cout++ + "." + string);
        }
    }
}
