package assignment24.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

        public void displayStudentDetails() {

        System.out.println("\n==============================");
        System.out.println("Student Name: " + studentName);
        System.out.println("Courses enrolled:");

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName()
                    + " (Level " + course.getCourselevel() + ")");
        }


    }
    }
