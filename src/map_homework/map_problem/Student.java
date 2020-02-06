package map_homework.map_problem;

import map_homework.map_problem.exceptions.NoDeclaredFacultyException;
import map_homework.map_problem.exceptions.NoDeclaredNameException;
import map_homework.map_problem.exceptions.NoDeclaredSurnameException;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private Faculty faculty;

    public Student(String firstName, String lastName, Faculty faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public String getFirstName() {
        if (firstName == null) {
            throw new NoDeclaredNameException("Declared name is wrong");
        }
        return firstName;
    }

    public String getLastName() {
        if (lastName == null) {
            throw new NoDeclaredSurnameException("Declared surname is wrong");
        }
        return lastName;
    }

    public Faculty getFaculty() {
        if (faculty == null) {
            throw new NoDeclaredFacultyException("Declared faculty is wrong");
        }
        return faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getLastName(), student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
