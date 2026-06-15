public class Transverse{
	public static void main(String[] args){
		int[] numbers = {6,9,5,12,4,8,5,2,16,14};
		int totalEvenNum = 0;
		for (int i = 0; i < 10; i++) {
			if (  numbers[i] % 2 == 0){
				totalEvenNum++;
			}
		}
		System.out.printf("The count of even numbers is %d%n",totalEvenNum);


		}
	}
