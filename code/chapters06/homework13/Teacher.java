package homework13;

public class Teacher extends Person {
    private int workAge;

    public Teacher(String name, String sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public void setStdId(int workAge) {
        this.workAge = workAge;
    }

    public int getStdId() {
        return workAge;
    }

    public void study() {
        System.out.println("I promise, I will teach seriously");
    }

    public void play() {
        super.play(); 
        System.out.println("爱玩象棋");
    }
}
