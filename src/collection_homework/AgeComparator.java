package collection_homework;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getAge() - secondStudent.getAge();

    }
}
