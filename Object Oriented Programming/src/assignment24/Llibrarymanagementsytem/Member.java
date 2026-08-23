package assignment24.Llibrarymanagementsytem;

public class Member {

    String membername;
    String bookName;
    int noOfBooks;

    public Member(String membername, String bookName) {
        this.membername = membername;
        this.bookName = bookName;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    void borrowABook(Book book) {
        if (book.getNoOfBooks() >0) {
           book.setNoOfBooks(book.getNoOfBooks()-1);
           bookName = book.getTitle();
            System.out.println("You have borrowed a book "+bookName);
        } else {
            System.out.println("book's not availiable");
        }
    }

    void returnABook(Book book) {
  
           book.setNoOfBooks(book.getNoOfBooks()+1);
           bookName =null;
            System.out.println("You have returned book:  "+bookName);
        
        }
    }
