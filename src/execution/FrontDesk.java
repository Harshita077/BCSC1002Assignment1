/*  Created by IntelliJ IDEA.
 *  User: Harshita Shukla
 *  Date: 30/08/20
 *  Time: 5:00 PM
 *  File Name : Student.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int EXIT = 4;
    public static final int ISSUE_A_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    public static final int SHOW_ALL_BOOKS_ISSUED = 3;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        Book bookObject = new Book();
        Library libraryObject = new Library();
        Student studentObject = new Student();
        System.out.println("Enter your first name");
        String firstName = scannerObject.nextLine();
        System.out.println("Enter your Middle Name");
        String middleName = scannerObject.nextLine();
        System.out.println("Enter your last Name");
        String lastName = scannerObject.nextLine();
        System.out.println("Enter your University Roll NO");
        Long rollNumber = scannerObject.nextLong();

        scannerObject.nextLine();
        System.out.println("-=-=--=-=-\"Welcome," + firstName + ", To The Front Desk\"-=-=--=-=-");
        System.out.println("How mai I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice from 1-4");


        int yourChoice = scannerObject.nextInt();
        String booksName;
        int booksIssued;
        if (yourChoice  <= 4) {


            switch (yourChoice) {
                case ISSUE_A_BOOK:
                    System.out.println("Enter name of the book you want to issue");
                    booksName = scannerObject.nextLine();
                    scannerObject.nextLine();
                    libraryObject.doCheckOut(booksName);
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOKS:
                    System.out.println("Enter name of the books you want to return");
                    scannerObject.nextLine();
                    booksName = scannerObject.nextLine();
                    libraryObject.doReturn(booksName);
                    break;
                case SHOW_ALL_BOOKS_ISSUED:
//                System.out.println("Enter number of books issued");
//                bookIssued = scannerObject.nextInt();
                    studentObject.getNameOfBooksIssued();
                    break;
                case EXIT:
                    break;

            }
        } else {
            System.out.println("Please choose the correct option");
        }
        scannerObject.close();

    }
}

