import java.util.Random;
public class RandomPassword{
	public static void main(String[] args){
		Random random = new Random();
String genPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                     + "abcdefghijklmnopqrstuvwxyz"
                     + "0123456789"
                     + "!@#$%^&*()_+-=[]{}|;:,.<>?";

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            int index = random.nextInt(genPassword.length());
            password.append(genPassword.charAt(index));
        }

        System.out.println("Generated Password: " + password);
}
}