package librarymanagementsystemapp;

public class Book {
    // private String typeOfBooks;
    String title;
    String author;
     int noOfCopies =  0;
     double price;
   // int newBook ;

    public Book( String title, String author, int noOfCopies, double price) {
        this.title = title;
        this.author = author;
        this.noOfCopies = noOfCopies;
        this.price = price;
       // this.newBook = newBook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNoOfBookCopies() {
        return noOfCopies;
    }

   public void setNoOfBooks(int noOfCopies) { 
       this.noOfCopies = noOfCopies;
   }
//
//    public int getNewBook() {
//        return newBook;
//    }
//
//    public void setNewBook(int newBook) {
//        this.newBook = newBook;
//    }

//
//    public void addBooks( int newBook) {
//              System.out.println("===============ADD BOOK ================= " );
//        System.out.println("Add a book: " + newBook);
//        noOfBooks += newBook;
//     System.out.println("New number of books: "+noOfBooks);
//    }
}
