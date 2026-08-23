package runtime;

public class StringIndexOutOfBoundsExceptionHandling {

    public static void main(String[] args) {
        String myName = "Mercy Ben";
        try {
            System.out.println(myName.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No value at index 10");
        }
    }
}
