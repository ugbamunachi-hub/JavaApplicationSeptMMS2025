public class Operator1{
	public static void main(String [] args){
		int num =200;
				System.out.printf("The value of the num is %d%n",num);
//Aritmetic Operator
		int num1 = 80;
		int num2 =100;
		
		System.out.printf("");
		System.out.println("===========================");
		
		int addition =num1 +num2;
		int subtraction=num1 -num2;
		double division=(double) num1/num2;
		int multiplication=num1*num2;
		int remainder = num1 % num2;
		
		System.out.printf("%d + %d =%d%n", num1,num2,addition);
		System.out.printf("%d - %d =%d%n", num1,num2,subtraction);
		System.out.printf("%d / %d =%d%n", num1,num2,division);
		System.out.printf("%d * %d =%d%n", num1,num2,multiplication);
		System.out.printf("%d %% %d =%d%n", num1,num2,remainder ); 
		
		//compound assignment Operator(+=,-=)
		num += num2;
		System.out.printf("The value if num1 has been updated to %d%n,num1");
									
		num -= num2;
		System.out.printf("The value if num1 has been updated to %d%n,num1");
		
		num /= num2;
		System.out.printf("The value if num1 has been updated to %d%n,num1");

		num %= num2;
		System.out.printf("The value if num1 has been updated to %d%n,num1");

				
		System.out.printf("");
		System.out.println("=======================");
		 int number1 =15;
		int number2 = 30;
		
		boolean isGreater = number1 >  number2;
		boolean islessThan = number1 <  number2;
		boolean isGreaterorequal = number1 >=  number2;
		boolean isLessThanorequalto = number1 >=  number2;
		boolean  isequalTo = number1 ==  number2;
		boolean  isnotequalTo = number1 ==  number2;

		
		System.out.printf("Is %d > %d :%b%n",number1,number2,isGreater);
		System.out.printf("Is %d < %d :%b%n",number1,number2,islessThan );
		System.out.printf("Is %d < %d :%b%n",number1,number2,isGreaterorequal );
		System.out.printf("Is %d < %d :%b%n",number1,number2,isLessThanorequalto );
		System.out.printf("Is %d < %d :%b%n",number1,number2,isequalTo );
		System.out.printf("Is %d < %d :%b%n",number1,number2,isnotequalTo );

		}
	}