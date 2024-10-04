package OCP;

import OCP.Employee;

public class Contract extends Employee {
    public Contract(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 1.1;
    }
}