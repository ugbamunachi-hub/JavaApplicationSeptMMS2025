
package school;

import java.time.LocalDate;

//properties of student
public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dOB;
    private String phoneNumber;

    public Student(int studentID, String firstName, String lastName, 
                    char gender,  LocalDate dOB, String phoneNumber) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;                                                           
        this.dOB = dOB;
        this.phoneNumber = phoneNumber;
    }

    
    
    
    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void displayStudentInfo(){
    System.out.println("StudentId:"+ studentID);
    System.out.println("FullName:"+ firstName + " "+lastName);
    System.out.println("Gender:"+ gender);
    System.out.println("DOB:"+ dOB);
    System.out.println("Phone Number:"+ phoneNumber);

    }
   public void payFees(double amount){
        System.out.println("Amount paid: %,.2f%n"+ amount);
    }
     public   void payFees(double amount,String fullname){
        System.out.printf("Amount paid: %,.2f%n", amount);
        System.out.printf("Student full name: %s%n", fullname);

            }
       public  void payFees(double amount,String fullname,String paymentMethod){
         System.out.printf("Amount paid: %,.2f%n", amount);                                            
        System.out.printf("Student full name: %s%n", fullname);
        System.out.printf("Payment mehtod: %s%n", paymentMethod);

         }                                                                                                                                         
}
