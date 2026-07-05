import  java.time.LocalDateTime;
public class UsingLocalDateTime{
	public static void main (String[] args){
		 LocalDateTime todaysDateTime = LocalDateTime.now();
		 LocalDateTime meetingDateTime = LocalDateTime.of(2021,05,15,06,30,45);
		// LocalDateTime classDateTime = LocalDateTime.parse("2022,07,25,12:04:23");
		LocalDateTime BirthDateTime = LocalDateTime.of(2009,03,20,07,30,45);
		boolean isBefore = meetingDateTime.isBefore(BirthDateTime);
		 boolean isAfter = meetingDateTime.isAfter(BirthDateTime);
		 
		 System.out.printf("The current date and time is %s%n",todaysDateTime);
		 System.out.printf("The meeting date and time is %s%n",meetingDateTime);
		// System.out.printf("The class time will be %s%n",classDateTime);
		System.out.printf("The resumption year is %s%n",meetingDateTime.getYear());
		System.out.printf("The resumption month is %s%n",meetingDateTime.getMonth());
		System.out.printf("The resumption day is %s%n",meetingDateTime.getDayOfMonth());
		System.out.printf("The metting date is %s%n",meetingDateTime.plusDays(10));
		System.out.printf("The party date will be %s%n",meetingDateTime.plusMonths(5));
		 System.out.printf("Is %s before  %s ? %b%n",meetingDateTime,BirthDateTime,isBefore);
		 System.out.printf("Is %s after %s ? %b%n",meetingDateTime,BirthDateTime,isAfter);

}
}