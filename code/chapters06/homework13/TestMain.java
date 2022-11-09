package homework13;

public class TestMain {
    public static void main(String[] args) {
        Person student1 = new Student("zzz", "男", 16, 21);
        Person student2 = new Student("xxx", "女", 13, 18);
        Person teacher1 = new Teacher("yyy", "男", 27, 5);
        Person teacher2 = new Teacher("ttt", "女", 33, 10);
        Person[] person = {student1, student2, teacher1, teacher2};

    }
}
