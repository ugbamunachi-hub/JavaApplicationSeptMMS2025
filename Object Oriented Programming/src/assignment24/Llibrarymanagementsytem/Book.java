package assignment24.Llibrarymanagementsytem;

public class Book {

    String title;
    int price;
    int noOfBooks;

    public Book(String title, int price, int noOfBooks) {
        this.title = title;
        this.price = price;
        this.noOfBooks = noOfBooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    void addBook(int newBook) {
                  System.out.println("===============ADD BOOK ================= " );
        System.out.println("Add a book: " + newBook);
        noOfBooks += newBook;
        System.out.println("You book has been added: " + noOfBooks);
    }

    void displayavailableBooks() {
          System.out.println(" ===============BOOK DETAILS================ " );
        System.out.println(" Book Title : " + title);
        System.out.println("book price: " + price);
        System.out.println("Available Books: " + noOfBooks);
    }
}
