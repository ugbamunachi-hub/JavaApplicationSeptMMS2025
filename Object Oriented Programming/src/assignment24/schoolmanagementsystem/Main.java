package assignment24.schoolmanagementsystem;

public class Main {

    public static void main(String[] args) {
        Course c1 = new Course("Gyno", 100);
        Course c2 = new Course("Optic", 200);
        Course c3 = new Course("java", 400);

        Teacher teacher1 = new Teacher("Mr Alison");
        Teacher teacher2 = new Teacher("Dr Fumi");

        teacher1.addCourse(c1);
        teacher2.addCourse(c2);

        Student s1 = new Student("Ejoge Peter");
        Student s2 = new Student("Obi Sandra");

        s1.enroll(c2);
        s1.enroll(c3);
        s2.enroll(c2);
        s2.enroll(c1);

        Classroom class1 = new Classroom("room 101", 12, c1);
        Classroom class2 = new Classroom("room 103", 16, c2);
        Classroom class3 = new Classroom("room 105", 19, c3);

        teacher1.displayTeacherDetails();
        teacher2.displayTeacherDetails();

        // Display student information
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        // s3.displayStudentDetails();

        //Display course information
        System.out.println("\n===== JAVA COURSE =====");
        c1.displayCourseDetails();

        System.out.println("\n===== SQL COURSE =====");
        c2.displayCourseDetails();

        System.out.println("\n===== DATABASE COURSE =====");
        c3.displayCourseDetails();

        // Display classroom information
        class1.displayClassroomDetails();
        class2.displayClassroomDetails();
        class3.displayClassroomDetails();

    }
}
