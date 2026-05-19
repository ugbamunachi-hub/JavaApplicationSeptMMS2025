import java.util.Scanner;
public class Exercises{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("ENter ur name");
		String name = input.nextLine();
 
		System.out.print("Enter ur age");
		int age = input.nextInt();
		
		input.nextLine();
		System.out.print("Enter ur school");
		String school = input.nextLine();
		
		System.out.println("--------USER DETAILS--------");
		System.out.println("Name:"+ name);
		System.out.println("Age:" + age);
		System.out.println("School:"+ school);
input.close();
	
 int int1 =23;
	 int int2 = 12;
	int sum = int1 + int2;
	 System.out.printf("Sum: %d", sum);
	}
	
	
}