/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment24.inheritance;

/**
 *
 * @author HP USER
 */
public class Teacher extends Person {

    String department;
    int salary;

    public Teacher(String department, int salary, String name, int age) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    @Override
    void displaydetails() {
        System.out.println("\n================Teacher Details ==================");
        System.out.println("Teacher name: " + name);
        System.out.println("Teacher age: " + age);
        System.out.println("Teacher department: " + department);
        System.out.println("Teacher salary: " + salary);
        System.out.println("==================================");

    }

}
