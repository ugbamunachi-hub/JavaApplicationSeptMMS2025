/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classwork5;

public  abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
       
    }
    abstract void PerformDuty();
    
    public void dispalyDetails(){
    System.out.print("Displaing details");
    }
    
    
}
