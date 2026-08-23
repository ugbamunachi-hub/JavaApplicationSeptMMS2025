/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment24.methodoverriding;

/**
 *
 * @author HP USER
 */
public class Car extends Vehicle{
     @Override
     void move(){
     System.out.println("""
            A car uses its engine,its four wheels to move and its controlled by a steering wheel.
                        """);
     }

}
