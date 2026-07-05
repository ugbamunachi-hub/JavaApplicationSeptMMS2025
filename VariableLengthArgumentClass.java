public class VariableLengthArgumentClass{
	public static void main(String[] args){
		System.out.printf("The sum is %d%n",oddNumbers(3,5,8,9,3,2,1));
		System.out.printf("The sum is %d%n",oddNumbers(8,2,6,7,5,6));
		System.out.printf("The sum is %d%n",oddNumbers(5,6,8,9,4));
		System.out.printf("The sum is %d%n",oddNumbers(5,6,8,6));
		System.out.printf("The sum is %d%n",oddNumbers(5,6,8));
		System.out.printf("The sum is %d%n",oddNumbers(5,6));
		System.out.printf("The sum is %d%n",oddNumbers(5));
		System.out.printf("The sum is %d%n",oddNumbers());

	}
	public static int oddNumbers(int... numbers){
		int odd =  0;

	for(int  number :numbers){
			if(number % 2 == 1){
				oddNumbers += number;
			
}
		System.out.printf("The sum is %d%n",oddNumbers());

	}
return odd;

}
}