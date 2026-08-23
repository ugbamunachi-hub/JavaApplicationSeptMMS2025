
package assignment24.constructors;
public class Book {
    String title;
    String author;
    int price;

    public Book(String title){
    this.title=title;
    }
    
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public  void displayBookDetails(){   
     System.out.println("\n=============BOOK DETAILS===============\n");

      System.out.println("Book Title: "+title);
       System.out.println("Book's Author: "+author);
      System.out.println("Book's Price: "+price);

}
}
