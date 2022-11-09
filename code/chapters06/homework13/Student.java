package homework13;

public class Student extends Person {
    private double stdId;

    public Student(String name, String sex, int age, double stdId) {
        super(name, sex, age);
        this.stdId = stdId;
    }

    public void setStdId(double stdId) {
        this.stdId = stdId;
    }

    public double getStdId() {
        return stdId;
    }

    public void study() {
        System.out.println("I promise, I will study hard");
    }

    public void play() {
        super.play();
        System.out.println("爱玩足球");
    }
}
