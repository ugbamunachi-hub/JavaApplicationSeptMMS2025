
package classwork5;

public class Student extends Person {
    
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void PerformDuty() {
System.out.println("student pays attention in class");    }

    void displayDetails() {
System.out.println("student name is "+name+" and age is "+ age);   
    }
    
}
