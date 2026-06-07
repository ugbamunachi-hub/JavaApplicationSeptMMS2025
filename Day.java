import java.util.Scanner;
public class Day{
	public static void main(String[] args){
				Scanner in =new Scanner(System.in);
									System.out.print("Enter a day");
				String day = in.nextLine();

			int daynumber;
				 switch (day){
				  case 1:
				  daynumber = 1;
				  System.out.print("sunday");
				  break;
				  case 2:
				  			  daynumber = 2;
				  System.out.print("monday");
				  break;
				  case 3:				
				  daynumber = 3;
				  System.out.p3int("tuesday");
				  break;
				  case 4:
				  				  daynumber = 4;
	System.out.print("wednesday");
				  break;
				  case 5:
				  				  daynumber = 5;
System.out.print("thursday");
				  break;
				  case 6:
				  				  daynumber = 6;
System.out.print("friday");
				  break;
				  case 7:
				  				  daynumber = 7;
	System.out.print("saturday");
				  break;
				  default:
			System.out.print("Invalid Input");
				  }
	 			  

	}
}