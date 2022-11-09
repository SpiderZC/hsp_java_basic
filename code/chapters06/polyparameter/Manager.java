package polyparameter;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    public void setBonus(double bonus) {
        this.bonus= bonus;
    }

    public double getSalary() {
        return bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public void manager() {
        System.out.println("Manager:" + getName() + "is manager");
    }
}
