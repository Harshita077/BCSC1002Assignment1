/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book{

    private String BookName;
    private String BookAuthour;
    private String ISBNnoOfBook;

    public Book(){
        this.BookName="The Blue Umbrella";
        this.BookAuthour="Ruskin Bond";
        this.ISBNnoOfBook="45865250200021";
    }

    public Book(String BookName,String BookAuthour,String ISBNnoOfBook){
        this.BookName=BookName;
        this.BookAuthour=BookAuthour;
        this.ISBNnoOfBook=ISBNnoOfBook;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName=BookName;
    }

    public String getBookAuthour() {
        return BookAuthour;
    }

    public void setBookAuthour(String bookAuthour) {
        this.BookAuthour = bookAuthour;
    }

    public String getISBNnoOfBook() {
        return ISBNnoOfBook;
    }

    public void setISBNnoOfBook(String ISBNnoOfBook) {
        this.ISBNnoOfBook = ISBNnoOfBook;
    }

    public String toString(){
        return "BookName:"+" "this.BookName + "\n" +"Authour of Book:"+" "this.BookAuthour()
            + "\n" + "ISBN code of the Book"+ " +this.ISBNnoOfBook" + ".";
    }
}


