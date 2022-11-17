package exercise;

public class Student extends Person {
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String say() {
        return super.say() + ", id = " + id + ", score = " + score;
    }
}
