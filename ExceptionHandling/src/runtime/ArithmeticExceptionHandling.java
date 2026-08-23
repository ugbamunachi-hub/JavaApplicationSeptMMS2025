
package runtime;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
       public static void main(String[] args) {
           Scanner scan =new Scanner(System.in);
       
           try{
           System.out.println("Divide first number by second number ");
           
           System.out.println("Enter first number: ");          
           int num1 = scan.nextInt();
           
           System.out.println("Enter second number: ");          
           int num2 = scan.nextInt();
           
           int division = num1/num2;
               System.out.printf("The result is %d%n",division);
       } 
           catch(ArithmeticException e){
               System.out.println("Number can not be divided by zero....IDIOT");
           }
           finally{
               System.out.println("I know  you didn't divide with 0  :)");
           }
}
}