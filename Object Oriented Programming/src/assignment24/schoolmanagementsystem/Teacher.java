package assignment24.schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String teacherName;
    private List<Course> courses;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
        this.courses = new ArrayList<>();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setTeacher(this);
        System.out.println(teacherName + " now teaches " + course.getCourseName());

    }

    public void displayTeacherDetails() {

        System.out.println("\n==============================");
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Courses taught: ");

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName()
                    + " (Level:  " + course.getCourselevel() + ")");
        }

        System.out.println("==============================");
        }
    }

