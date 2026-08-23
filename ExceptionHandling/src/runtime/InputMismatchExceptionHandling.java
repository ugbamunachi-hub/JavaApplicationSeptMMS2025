
package runtime;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMismatchExceptionHandling {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            try{
            System.out.println("Enter your age: ");
            long age = input.nextLong();
        
            System.out.printf("You are %d years old\n",age);
        }
            catch(InputMismatchException e){
                System.out.println("Age is a number");
            }
        }
}
