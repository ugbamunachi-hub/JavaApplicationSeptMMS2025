
package assignment24.inheritance;


public class  Student  extends Person {
     String course;
     int level;
     
    public Student(String course, int level, String name, int age) {
        super(name, age);
        this.course = course;
        this.level = level;
    }
     
     @Override
    void displaydetails(){
            System.out.println("================Student Details ==================\n");
    System.out.println("Student name: "+name);
      System.out.println("Student age: "+age);
    System.out.println("Student course: "+course);
    System.out.println("Student level:"+level);
            System.out.println("===================================================");

    }
    }
    

