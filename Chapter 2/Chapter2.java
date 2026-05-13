	import java.util.Scanner;

public class Chapter2{
	public static void main(String[] args){
		 //2.10
		 int x = 2;
		 int y = 3;
		 System.out.printf("x = %d%n", x); 
		 System.out.printf("Value of %d + %d is %d%n", x, x, (x + x)); 
		 System.out.printf("x ="); 
		 System.out.printf("%d = %d%n", (x + y), (y + x)); 

//2.14
			//Using one System.out.println statement:
	System.out.println("1 2 3 4");
	// Using four System.out.print statements:
	System.out.print("1 ");
	System.out.print("2 ");
	System.out.print("3 ");
	System.out.print("4"); 
	// Using one System.out.printf statement:
	System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
	
//2.16
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if (n1 > n2) System.out.printf("%d is larger%n", n1);
        if (n2 > n1) System.out.printf("%d is larger%n", n2);
        if (n1 == n2) System.out.println("These numbers are equal");
	   // 2.17
        System.out.print("Enter three integers: ");
        int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();
        int sum = a + b + c;
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%nSmallest: %d%nLargest: %d%n", 
            sum, (sum / 3), (a * b * c), smallest, largest);
    //2.19
		System.out.printf("*%n**%n***%n****%n*****%n"); 
		
		//	2.20  
		System.out.println("*"); System.out.println("***"); System.out.println("*****"); 
		System.out.println("****"); 
		System.out.println("**");

		 //2.21
		System.out.print("*"); System.out.print("***"); 
		System.out.print("*****"); 
		System.out.printl("****"); 
		System.out.println("**"); 

		//2.22  
		System.out.println("*");
		 System.out.println("***"); 
		System.out.println("*****"); 
		System.out.print("****"); 
		System.out.println("**"); 

		//2.23
		System.out.printf("%s%n%s%n%s%n", "*", "***", "*****");


        // Declare variables first
        int i = 1, j = 2, k = 3, a = 2, x = 5;

        // Now you can use the statements from your image:
        int p = i + j + k + 7;
        int y = a * x * x * x + 7;

        System.out.println("Value of p: " + p);
        System.out.println("Value of y: " + y);
//2.15
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Quotient is %d%n", quotient);
        
        input.close();
//2.24    
	System.out.print("Enter five integers separated by spaces: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        int largest = n1;
        int smallest = n1;

        if (n2 > largest) largest = n2;
        if (n3 > largest) largest = n3;
        if (n4 > largest) largest = n4;
        if (n5 > largest) largest = n5;

        if (n2 < smallest) smallest = n2;
        if (n3 < smallest) smallest = n3;
        if (n4 < smallest) smallest = n4;
        if (n5 < smallest) smallest = n5;

        System.out.printf("Largest: %d%nSmallest: %d%n", largest, smallest);
   
	System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }
        if (number % 2 != 0) {
            System.out.println("Odd");
        
//2.26
 System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 % num2 == 0) {
            System.out.printf("%d is a multiple of %d%n", num1, num2);
        }
        if (num1 % num2 != 0) 
            System.out.printf("%d is not a multiple of %d%n", num1, num2);
        
 //2.32
	 int negatives = 0;
        int positives = 0;
        int zeros = 0;

        System.out.println("Enter five integers:");

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();

            if (num < 0) {
                negatives++;
            } else if (num > 0) {
                positives++;
            } else {
                zeros++;
            }
        }

        System.out.printf("Negative numbers: %d%n", negatives);
        System.out.printf("Positive numbers: %d%n", positives);
        System.out.printf("Zero values: %d%n", zeros);
        
        input.close();
    }
}
	