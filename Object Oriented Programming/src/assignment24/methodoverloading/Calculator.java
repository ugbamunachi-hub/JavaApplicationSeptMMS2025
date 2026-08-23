
package assignment24.methodoverloading;


public class Calculator {
 
    void calculate(int integer1,int integer2){
        int addTwoInt = integer1 + integer2;
        System.out.println("You have added two integers: "+addTwoInt);
    }
    
     void calculate(int integer1,int integer2,int integer3){
        int addTwoInt = integer1 + integer2 + integer3;
        System.out.println("You have added three integers: "+ addTwoInt);
     }
         void calculate(double decimal1,double decimal2){
        double addTwodecimals = decimal1 + decimal2;
        System.out.println("You have added two decimals: "+ addTwodecimals);
    }
   
    void calculate(long long1,long long2){
        long multiplyTwoInt = long1 * long2;
        System.out.println("You have multiplied two integers: "+multiplyTwoInt);
    } 
}
