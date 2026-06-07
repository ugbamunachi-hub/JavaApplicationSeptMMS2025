 import java.util.Scanner;

public class SentinelRepetition {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num;
		int sum = 0;
		System.out.println("eneter -1 to end the input: ");
		while(true){
			System.out.print("Enetr number: ");
			num = scan.nextInt();
			
			if(num == -1){
				break;
			}
			
			sum+= num;
		}
		System.out.printf("The sum of all the number is %d%n",sum);	

	}
	
}
