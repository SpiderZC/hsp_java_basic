import java.util.Scanner;

public class RecursionExercise02 {
    public static void main(String[] args) {
        T t = new T();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number(range is 1 ~ 10)");
        int number = sc.nextInt();
        if (t.recursion(number) == - 1) {
            System.out.println("wrong number!!!\nplease enter the right number!!!");
        } else {
            System.out.println(t.recursion(number));
        }
    }

    // 1 1 2 3 5 8 13
}

class T {
    public int recursion(int n) {
        if (n < 1 || n > 10) {
            return -1;
        } else if (n == 10) {
            return 1;
        } else {
            return (recursion(n + 1) + 1) * 2;
        }
    }
}
