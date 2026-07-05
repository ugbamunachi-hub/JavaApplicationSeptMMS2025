import java.util.Arrays;
public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int [] a = {7,9,6};
		int[] b = {7,9,6};
		int[] c ={7,9,9};
		int[] d ={7,9,6};

		int[] myFillArray = new int[10];
	    Arrays.fill(myFillArray,5);
		
	
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number :numbers){
		System.out.printf("%d%n",number);

		}
		System.out.println("Binary Search:");
		 int index = Arrays.binarySearch(numbers,9);
		System.out.printf("The index number of 9 is : %d%n",index);
		
		 boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n",isEqual);

		int isCompare = Arrays.compare(c,d);
		System.out.printf("The result is %d%n",isCompare);

		System.out.println("my Fill Array is");
		for (int number : myFillArray){
		System.out.printf("%d%n",number);
		}
		 int[] evenNumbers = {2,4,6,8,10,12,14,16,18,20};
		int[] copyArr = Arrays.copyOf(evenNumbers,5);
		System.out.println("The elements of the array are:");
		for(int arr : copyArr){
			System.out.printf("%d%n",arr);
		}
				System.out.println(Arrays.toString(evenNumbers));

	int [][]  multiarray ={
		{2,3,4},
		{5,3,6}
	};
					System.out.println(Arrays.deepToString(multiarray));

	}
}