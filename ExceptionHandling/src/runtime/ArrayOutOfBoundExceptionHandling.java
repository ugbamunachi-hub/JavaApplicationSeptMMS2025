package runtime;

public class ArrayOutOfBoundExceptionHandling {

    public static void main(String[] args) {

        int[] age = {16, 21, 19, 20, 14};
        try{
        System.out.println("Element at index 2 is: " + age[2]);
        }
        catch( ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
}
