import java.util.Random;
public class GenerateAccountNumber{
	public static void main(String[] args){
		Random random = new Random();
				 int accountnumber = random.nextInt(30) +100;
				 		 System.out.printf("The generated account number is %d%n",Math.abs(accountnumber));


	}
}