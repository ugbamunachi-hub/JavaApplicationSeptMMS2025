package assignment24.schoolmanagementsystem;

public class Classroom {

    private String roomNumber;
    private int capacity;
    private Course course;

    public Classroom(String roomNumber, int capacity, Course course) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.course = course;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayClassroomDetails() {

        System.out.println("\n==============================");
        System.out.println("Classroom: " + roomNumber);
        System.out.println("Capacity: " + capacity);

        if (course != null) {
            System.out.println("Course: " + course.getCourseName());
        }

        System.out.println("==============================");
    }
}