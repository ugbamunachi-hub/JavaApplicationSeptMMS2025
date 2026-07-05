import java.util.Set;
import java.util.HashSet;
public class UsingSetClasswork{
	public static void main(String[] args){
		Set<String> studentEmail = new HashSet<>();
		
		studentEmail.add("shalomoka23@gmail.com");
		studentEmail.add("victorsheldon245@gmail.com");
		studentEmail.add("dodoret5@gmaill.com");
		studentEmail.add("munachisochi12@gmail.com");
		studentEmail.add("victorogun45@gmaill.com");
		studentEmail.add("kennywise@gmail.com");
		studentEmail.add("wennygodswill89@gmail.com");
		studentEmail.add("elleanderson@gmail.com");
		studentEmail.add("jacekings34@gmail.com");
		studentEmail.add("endurancegrand@gmail.com");

for ( String email :studentEmail)
	System.out.println(email);
	}
}