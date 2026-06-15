import java.util.Scanner;
public class Number{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		        System.out.print("enter a number");
						int number=scanner.nextInt();
						
			if(number % 5==0 && number /3 ==0)
			   System.out.printf("FizzBuzz");
				if (number % 5== 0)
				System.out.print("Fizz");
			  else if(number  %3 ==0)
			  System.out.printf("Buzz");
				else if (number % 5== 0)
				System.out.print("Fizz");
			  
				else 
				System.out.print(number);


	}
}