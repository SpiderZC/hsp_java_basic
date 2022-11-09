package exercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("Spider", 18);
        System.out.println(person.say());

        Person student = new Student("98ZC", 21, 0, 999);
        System.out.println(student.say());

    }
}
