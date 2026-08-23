/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork5;


public class Main {
    public static void main(String[] args){
   Teacher teacher = new Teacher( "Mr Alison", 31);
   Student student = new Student("Ben",15);
   
    teacher.PerformDuty();
    teacher.displayDetails();
      
       System.out.println("=======================");
       
    student.PerformDuty();
    student.displayDetails();

}
}