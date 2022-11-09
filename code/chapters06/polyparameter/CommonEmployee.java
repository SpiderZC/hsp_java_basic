package polyparameter;

public class CommonEmployee extends Employee {
    public CommonEmployee(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("CommonEmployee:" + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
