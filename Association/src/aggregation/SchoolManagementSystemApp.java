package aggregation;

import composition.Payment;
import java.time.LocalDate;
import java.util.ArrayList;

public class SchoolManagementSystemApp {

    public static void main(String[] args) {
        //Payment objects created
                     
        //Student objects created
        
        Student s1 = new Student(101, "Henry", "John", 'M');
        Student s2 = new Student(102, "Joy", "Jack", 'F');
        Student s3 = new Student(103, "Franklin", "Williams", 'M');
        Student s4 = new Student(104, "Toby", "Emmanuel", 'M');
        Student s5 = new Student(105, "Lucy", "Andy", 'F');
        Student s6 = new Student(106, "Andrea", "Genderson", 'F');
        Student s7 = new Student(107, "Tom", "Hanks", 'F');
        Student s8 = new Student(108, "Lucy", "Simon", 'F');

        
        s1.makePayment(300000.00, LocalDate.of(2026,8,10),
                "Transfer", "Paid for Data AnalyTics");
          
        s3.makePayment(500000.00, LocalDate.of(2026,8,8),
                "POS", "Paid for Java");
          
        s1.makePayment(350000.00, LocalDate.of(2026,8,5),
                "Transfer", "PAid for MMS");
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);

        School school = new School("Green Land International", students);
        school.displaySchoolDetails();


    }
}
