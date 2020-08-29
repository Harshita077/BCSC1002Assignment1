/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String BookName;
    private String BookAuthour;
    private String ISBNnoofBook;

    public Book(){
        this.BookName="The Blue Umbrella";
        this.BookAuthour="Ruskin Bond";
        this.ISBNnoofBook="52502045860021";

    }
    public Book(String BookName,String BookAuthour,String ISBNnoofBook){
        this.BookName=BookName;
        this.BookAuthour= BookAuthour;
        this.ISBNnoofBook=ISBNnoofBook;

    }

}
