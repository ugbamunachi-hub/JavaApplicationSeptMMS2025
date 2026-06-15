import java.util.Random;
public class AccountNumber{
	public static void main(String[] args){
		Random random = new Random();
		        StringBuilder accountNumber = new StringBuilder("30");

        for (int i = 0; i < 8; i++) {
            accountNumber.append(random.nextInt(10));
        }

        System.out.println("AccountNumber: " + accountNumber);
}
}