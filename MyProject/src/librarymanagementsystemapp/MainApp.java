
package librarymanagementsystemapp;


public class MainApp {
    public static void main(String[] args){
        
        Book b1 = new Book("Ogadimma","Chigbo",23,6500);
     Library  l1 = new Library("Sarah' Library","No 13 nsukka street");
     Member m1 =new Member("Cynthia oran");
l1.add(b1);
l1.registerMembers(m1);
    }
}
