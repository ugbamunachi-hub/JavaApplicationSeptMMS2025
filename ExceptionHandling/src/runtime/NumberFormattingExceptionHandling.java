package runtime;

public class NumberFormattingExceptionHandling {
    public static void main(String[] args) {
        String age = "20";
        try {
            int myAge = Integer.parseInt(age);

            System.out.println("I am " + myAge + " years old");
        } catch (NumberFormatException e) {
            System.out.println("String cannot be converted to a Integer."
                    + "Enter a valid number");
            System.out.println(e.getMessage());
        }
    }
}
