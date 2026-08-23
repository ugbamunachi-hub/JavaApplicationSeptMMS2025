package librarymanagementsystemapp;

import java.util.ArrayList;
//import java.util.List;

public class Library {

    String LibraryName;
    String address;
    private ArrayList<Member> members;
     ArrayList<Book> books;

    public Library(String LibraryName, String address) {
        this.LibraryName = LibraryName;
        this.address = address;
        members = new ArrayList<>();
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

   
  public void registerMembers(Member member){
       members.add(member);
      System.out.println("you hava added a new member to your library"
              + "\n Number of members: "+members.size());
}
 
  public void add(Book book){
       books.add(book);
     System.out.println("you hava added a new book to your library");
     System.out.println("Number of Copies of the book: "+ book.getNoOfBookCopies()+
             "\nAuthor: "+book.getAuthor());

}}
