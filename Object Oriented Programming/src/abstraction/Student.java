
package abstraction;

public class Student extends Person{
int studentID;

    public Student( String firstName,String lastName,
            String phoneNumber, String address,int studentID) {  
        super(  firstName,  lastName,  phoneNumber,  address);
                this.studentID = studentID;
    }

    public Student(){
    }
    @Override
    void study() {
        System.out.println(firstName + " "+lastName+"  is studying");
    }
    void read(){
    System.out.println(firstName + " "+lastName+" is reading");
            }
}
