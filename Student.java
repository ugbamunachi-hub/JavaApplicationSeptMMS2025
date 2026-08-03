public class Student{
	//properties
	private	int studentID;
	private	String firstName;
	private String lastName;
	private	char gender;
	//constructor
	public Student(int studentID,String firstName,String lastName,char gender){
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	/*functionality
	public void eat(){
		System.out.println("I am eating");
	}
	public void sleep(){
		System.out.println("I am sleeping");
	}
	public void sing(){
	System.out.println("I am singing");}*/
	
	public void displayStudentInfo(){
		System.out.println("StudentID: " + studentID);
		System.out.println("FirstName: " + firstName);
		System.out.println("LastName: " + lastName);
		System.out.println("Gender: " + gender);

	}
}