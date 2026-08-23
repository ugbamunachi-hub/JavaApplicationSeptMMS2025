
package classwork5;


public class Teacher extends Person{
    
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void PerformDuty() {
    System.out.println("Teacher is teaching students");
    
    }

    void displayDetails() {
    System.out.println("Teachers name is "+name+" and age is "+age);
    }

}
