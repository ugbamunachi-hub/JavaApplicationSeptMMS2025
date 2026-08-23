package assignment24.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String courseName;
    int courselevel;
    Teacher teacher;
    List<Student> students;

    public Course(String courseName, int courselevel) {
        this.courseName = courseName;
        this.courselevel = courselevel;
        this.students = new ArrayList<>();

    }

     String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourselevel() {
        return courselevel;
    }

    public void setCourselevel(int courselevel) {
        this.courselevel = courselevel;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourseDetails() {
        // System.out.println("==========Course Details================ ");
        System.out.printf("Course Name: %s%n ", courseName);
        System.out.printf("Course level: %s%n ", courselevel);
    
    if(teacher!= null){
       System.out.printf("Teacher:  ", teacher.getTeacherName());
    }

    System.out.println ("Students registered: ");
    for (Student student : students){
       System.out.println("- " + student.getStudentName());

    }
 }

   
}
