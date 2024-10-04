package OCP;

import OCP.Employee;

public class Pemanent extends Employee {
    public Pemanent(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 1.2;
    }
}