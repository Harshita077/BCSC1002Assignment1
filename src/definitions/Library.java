package definitions;

import java.util.Arrays;

public class Library {
    private Book[] currentlyAvailableBooks;

    //Created the Constuctor
    public Library() {
        this.currentlyAvailableBooks = new Book[10];


        this.currentlyAvailableBooks[0] = new Book("The Blue Umbrella", "Ruskin Bond", "7536598493435");
        this.currentlyAvailableBooks[1] = new Book("The Tempest", "William Shakespeare", "8753920278842");
        this.currentlyAvailableBooks[2] = new Book("Treasure Trove", "Michael Stadther", "3490267835203");
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "currentlyAvailableBooks=" + Arrays.toString(currentlyAvailableBooks) +
                '}';
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

    public void addBooks(String bookName) {
        System.out.println(bookName + ",is added Successfully");
    }

    public void doCheckOut(String bookName) {
        System.out.println(bookName + ",is issued Successfully");
    }

    public void doReturn(String bookName) {
        System.out.println(bookName + " is returned Successfully");
    }

    public void listBooks() {
        for (Book bookObject : this.currentlyAvailableBooks) {
            System.out.println();
        }
    }
}
