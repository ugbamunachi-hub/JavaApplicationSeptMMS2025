package aggregation;

import java.util.List;

public class School {

    private String schoolName;
    private List<Student> students;

    public School(String schoolName, List<Student> students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public void displaySchoolDetails() {
        System.out.println("School Information");
        System.out.println("============================================= ");

        System.out.printf("School Name: %s%n ", schoolName);
        System.out.printf("Number of Students: %s%n ", students.size());
        System.out.println("============================================= ");

        for (Student student : students) {
            student.displayStudentDetails();

        }
    }
}
