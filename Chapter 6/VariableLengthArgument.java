//6.13The elements are set to zero row by row, from left to right. The table below represents the sequence numbers (1 to 15) in which each cell is updated:Col 0Col 1Col 2Col 3Col 4Row 012345Row 1678910Row 211121314156.14java
public class VariableLengthArgument {
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
//6.15java
public class CommandLineSize {
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
