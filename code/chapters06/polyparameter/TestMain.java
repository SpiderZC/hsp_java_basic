package polyparameter;


public class TestMain {
    public static void main(String[] args) {
        Employee employee = new CommonEmployee("dudu", 5000);
        Employee manager = new Manager("jack", 5000, 1000);

        testWork(employee);
        System.out.println(showEmpAnnual(employee));
        testWork(manager);
        System.out.println(showEmpAnnual(manager));

    }

    public static double showEmpAnnual(Employee employee) {
        if (employee instanceof CommonEmployee) {
            return ((CommonEmployee) employee).getAnnual();
        } else if (employee instanceof Manager) {
            return ((Manager) employee).getAnnual();
        } else {
            return 0.0;
        }
    }

    public static void testWork(Employee employee) {
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            manager.manager();
        } else if (employee instanceof CommonEmployee) {
            ((CommonEmployee)employee).work();
        }
    }
}
