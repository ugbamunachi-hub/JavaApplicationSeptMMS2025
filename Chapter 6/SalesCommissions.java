//6.10java
import java.util.Scanner;

public class SalesCommissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counters = new int[9]; // Index 0-7 for ranges, Index 8 for $1000+

        System.out.println("Enter gross sales for salespeople (Enter -1 to finish):");
        while (true) {
            System.out.print("Enter sales amount: ");
            double grossSales = input.nextDouble();
            if (grossSales < 0) break;

            int salary = 200 + (int) (0.09 * grossSales);
            int rangeIndex = (salary - 200) / 100;

            if (rangeIndex > 8) {
                rangeIndex = 8;
            }

            counters[rangeIndex]++;
        }

        System.out.printf("%n%-15s%s%n", "Salary Range", "Number of Salespeople");
        System.out.printf("$200-299       %d%n", counters[0]);
        System.out.printf("$300-399       %d%n", counters[1]);
        System.out.printf("$400-499       %d%n", counters[2]);
        System.out.printf("$500-599       %d%n", counters[3]);
        System.out.printf("$600-699       %d%n", counters[4]);
        System.out.printf("$700-799       %d%n", counters[5]);
        System.out.printf("$800-899       %d%n", counters[6]);
        System.out.printf("$900-999       %d%n", counters[7]);
        System.out.printf("$1000 and over %d%n", counters[8]);
    }
}
Use code with caution.6.11java// a) Set the 10 elements of integer array counts to zero
int[] counts = new int[10]; 

// b) Add one to each of the 15 elements of integer array bonus
for (int i = 0; i < bonus.length; i++) {
    bonus[i] += 1;
}

// c) Display the five values of integer array bestScores in column format
for (int i = 0; i < 5; i++) {
    System.out.println(bestScores[i]);
}
Use code with caution.6.12javaimport java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 10 and 100: ");
            int num = input.nextInt();

            while (num < 10 || num > 100) {
                System.out.print("Invalid input. Enter a number between 10 and 100: ");
                num = input.nextInt();
            }

            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[count] = num;
                count++;
            }

            System.out.print("Unique values entered so far: ");
            for (int j = 0; j < count; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println();
        }
    }
}
Use code with caution.6.13The elements are set to zero row by row, from left to right. The table below represents the sequence numbers (1 to 15) in which each cell is updated:Col 0Col 1Col 2Col 3Col 4Row 012345Row 1678910Row 211121314156.14javapublic class VariableLengthArgument {
    public static void main(String[] args) {
        System.out.printf("Product of 2 and 3: %d%n", product(2, 3));
        System.out.printf("Product of 4, 5, and 6: %d%n", product(4, 5, 6));
        System.out.printf("Product of 1, 2, 3, 4, and 5: %d%n", product(1, 2, 3, 4, 5));
    }

    public static int product(int... numbers) {
        if (numbers.length == 0) return 0;
        int totalProduct = 1;
        for (int num : numbers) {
            totalProduct *= num;
        }
        return totalProduct;
    }
}
Use code with caution.6.15javapublic class CommandLineSize {
    public static void main(String[] args) {
        int arraySize = 10;

        if (args.length > 0) {
            arraySize = Integer.parseInt(args[0]);
        }

        int[] array = new int[arraySize];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
Use code with caution.6.16javapublic class EnhancedForSum {
    public static void main(String[] args) {
        double total = 0.0;

        for (String arg : args) {
            total += Double.parseDouble(arg);
        }

        System.out.printf("The sum of arguments is: %.2f%n", total);
    }
}
Use code with caution.6.17javaimport java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] frequencies = new int[13]; // Indices 2 to 12 will hold the counts

        for (int roll = 0; roll < 36_000_000; roll++) {
            int die1 = 1 + randomNumbers.nextInt(6);
            int die2 = 1 + randomNumbers.nextInt(6);
            frequencies[die1 + die2]++;
        }

        System.out.printf("%-10s%s%n", "Sum", "Frequency");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%-10d%d%n", sum, frequencies[sum]);
        }
    }
}
