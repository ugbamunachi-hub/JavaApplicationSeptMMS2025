

import java.util.Scanner;

public class AcceptNumber{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
				int [] numbers =new int [10];

					for ( int i = 0 ; i< 10;i++){
									System.out.printf("Enter a number:");
					 numbers[i] = scan.nextInt();
					}
					int sum1 =numbers [0]+ numbers [4] +numbers [9];

					int sum2 =numbers [2]+ numbers [7] +numbers [1];
					 int multipliedresult=sum1 * sum2;

					int sum3 =numbers [3]+ numbers [6] +numbers [8] + numbers [5];

   int finalresult=multipliedresult - sum3;
   					System.out.println("The final result is " +finalresult);

  if (finalresult >= 100){
	  						System.out.println("Hurray i did it!!!!!!");
  }
  else{
					System.out.println("I need to still learn more in java");
  }
  scan.close();
	}
}