//write a java prograam to accept number from auser and display the sum,average,product of five numbers
import java.util.Scanner;

public class Classwork1{
		public static void main (String[] args){
					 Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        int n1 = input.nextInt();
		 int n2 = input.nextInt();
		 int n3 = input.nextInt();
		 int n4 = input.nextInt();
		 int n5 = input.nextInt();
		 
		 
		 int sum = (n1 + n2 +n3 +n4 +n5);
        int averageOfNumbers = (sum/5) ;
		int productOfnumbers = (n1 * n2 *n3 *n4 *n5);

System.out.printf("Sum is %d%n", sum);
        System.out.printf("averageOfNumbers is %d%n", averageOfNumbers);
        System.out.printf("productOfnumbers is %d%n",productOfnumbers );
		
		
}}