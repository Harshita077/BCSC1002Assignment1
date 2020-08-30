/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private  Book [] currentlyAvailableBooks ;

    public Library(Book[] currentlyAvailableBooks){
        this.currentlyAvailableBooks=currentlyAvailableBooks;
    }
    public Library(){
        Book bookA = new Book("The Blue Umbrella","Ruskin Bond","45865250200021");
        Book bookB = new Book("The Tempest","William Shakespeare","809039390567");
        Book bookC = new Book("Treasure Trove","Michael Stadther","952020827494");

    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks.clone();
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return Arrays.toString(currentlyAvailableBooks);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailableBooks(), library.getCurrentlyAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());
    }
}
