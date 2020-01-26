package collection_homework;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getFirstName().compareTo(secondStudent.getFirstName());
    }
}
