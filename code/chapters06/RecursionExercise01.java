import java.util.Scanner;

public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println("Do you want to know which number?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        T t = new T();
        int number = t.recursion(a);
        if(number == -1) {
            System.out.println("please enter a number which is greater than 0");
        } else {
            System.out.println("the number is " + number);
        }
    }

    // 1 1 2 3 5 8 13
}

class T {
    public int recursion(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return recursion(n - 1) + recursion(n - 2);
            }
        }
    }
}
