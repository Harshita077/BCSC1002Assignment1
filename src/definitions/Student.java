/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollnoOfStudent;
    private int totalNoOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String firstNameOfStudent,String middleNameOfStudent,String lastNameOfStudent,long universityRollnoOfStudent,int totalNoOfBooksIssued) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.universityRollnoOfStudent=universityRollnoOfStudent;
        this.totalNoOfBooksIssued=totalNoOfBooksIssued;
    }
}
