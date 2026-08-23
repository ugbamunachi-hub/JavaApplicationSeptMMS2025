
package librarymanagementsystemapp;

public class Member {
    String memberName;
    Library library;
    Book book;

    public Member(String memberName) {
        this.memberName = memberName;
        this.library = null;
        this.book = null;
    }
   void borrowABook(Book book) {
        if (book.getNoOfBooks() >0) {
           book.setNoOfBooks(book.getNoOfBooks()-1);
            String bookName = book.getTitle();
            System.out.println("You have borrowed a book "+bookName);
        } else {
            System.out.println("book's not availiable");
        }
    }

    void returnABook(Book book) {
  
           book.setNoOfBooks(book.getBooks()+1);
          String bookName =null;
            System.out.println("You have returned book:  "+bookName);
        
        }
    }

}
