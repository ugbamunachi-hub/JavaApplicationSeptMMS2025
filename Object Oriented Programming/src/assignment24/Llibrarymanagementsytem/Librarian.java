package assignment24.Llibrarymanagementsytem;

public class Librarian {

    int noOfMembers = 10;

    void registeringMembers(int newMember) {
        System.out.println(" ===============REGISTER MEMBERS================ ");
        System.out.println("Add a Member or Members: " + newMember);
        noOfMembers += newMember;
        System.out.println("You have added a member(s): " + noOfMembers);
    }
}
