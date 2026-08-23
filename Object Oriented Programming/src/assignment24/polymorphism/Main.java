package assignment24.polymorphism;

public class Main {

    public static void main(String[] args) {
        Employee employee;
        employee  = new FullTimeEmployee();
        employee  = new PartTimeEmployee();
        employee  = new ContractEmployee();

        employee.calculateSalary();
        employee.calculateSalary();
        employee.calculateSalary();
    }
}
