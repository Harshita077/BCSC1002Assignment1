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

    public Student () {
        this.nameOfBooksIssued = new Book[15];
    }

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public long getUniversityRollnoOfStudent() {
        return universityRollnoOfStudent;
    }

    public void setUniversityRollnoOfStudent(long universityRollnoOfStudent) {
        this.universityRollnoOfStudent = universityRollnoOfStudent;
    }

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued.clone();
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }
    @Override
    public String toString() {
        return Arrays.toString(nameOfBooksIssued);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollnoOfStudent() == student.getUniversityRollnoOfStudent() &&
                totalNoOfBooksIssued == student.totalNoOfBooksIssued &&
                Objects.equals(getFirstNameOfStudent(), student.getFirstNameOfStudent()) &&
                Objects.equals(getMiddleNameOfStudent(), student.getMiddleNameOfStudent()) &&
                Objects.equals(getLastNameOfStudent(), student.getLastNameOfStudent()) &&
                Arrays.equals(getNameOfBooksIssued(), student.getNameOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getUniversityRollnoOfStudent(), totalNoOfBooksIssued);
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssued());
        return result;
    }
}
