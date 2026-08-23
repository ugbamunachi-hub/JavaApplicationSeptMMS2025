package runtime;

import java.util.Scanner;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
         try {
        String name = "John Doe";
//        System.out.print("Enter your name: ");
//        name = scan.nextLine();
        
         System.out.println("The length of name is " + name.length());
         
        } catch (NullPointerException e) {
            System.out.println("Name has not been intialized");
        }
    }
}
