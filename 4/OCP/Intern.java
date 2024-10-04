package OCP;

import OCP.Employee;

public class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * 0.8;
    }
}