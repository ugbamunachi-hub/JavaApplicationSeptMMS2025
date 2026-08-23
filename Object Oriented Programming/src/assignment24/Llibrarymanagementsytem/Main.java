

package assignment24.Llibrarymanagementsytem;


public class Main {
   public static void main(String[] args) {
   Book  book1 = new Book("Diary of a House Maid",6500,1);
      Book  book2 = new Book("Barbie",1900,1);
      Book  book3 = new Book("Diary of the wimpy kid",5000,2);

      Member  member = new Member("Okoro","Diary of a house maid");
   Librarian librarian = new Librarian();
   book1.addBook(1);
   librarian.registeringMembers(3);
     System.out.println("=============BORROW OR REURN A BOOK===============\n");
    member.returnABook(book1);
    member.borrowABook(book3);
   book1.displayavailableBooks();

   }
}
