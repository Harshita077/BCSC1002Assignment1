/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book{

    private String bookName;
    private String bookAuthor;
    private String iSBNnoOfBook;

    public Book(){
        this.bookName="The Blue Umbrella";
        this.bookAuthor="Ruskin Bond";
        this.iSBNnoOfBook="45865250200021";
    }

    public Book(String bookName,String bookAuthor,String iSBNnoOfBook){
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.iSBNnoOfBook=iSBNnoOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName=bookName;
    }

    public String getbookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getiSBNnoOfBook() {
        return iSBNnoOfBook;
    }

    public void setISBNnoOfBook(String iSBNnoOfBook) {
        this.iSBNnoOfBook = iSBNnoOfBook;
    }

    public String toString(){
        return "BookName:"+" " + this.bookName  +  "\n" + "Author of Book:" + " "+ getbookAuthor() + "\n" + "ISBN code of the Book" + " "+ this.iSBNnoOfBook + ".";
    }

    public void doCheckout(){
        System.out.println("Thank you for reading the Book");
    }

    public void doReturn(){
        System.out.println(" Thank you for returning the book");

    }
    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book =(Book) o;
        return Objects.equals(getBookName(),book.getBookName()) && Objects.equals(getbookAuthor(),book.getbookAuthor()) && Objects.equals(getiSBNnoOfBook(),book.getiSBNnoOfBook());
    }
}


