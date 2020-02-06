package map_homework.map_problem;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

public class Service {
    private HashMap<Student, Integer> studentsHashMap = new HashMap<>();
    private EnumMap<Faculty, Integer> facultyEnumMap = new EnumMap<>(Faculty.class);

    public HashMap<Student, Integer> getStudentsMap(ArrayList<Student> students) {
        for (Student str : students) {
            Integer numberOfStudentsOccurrences = studentsHashMap.get(str);
            studentsHashMap.put(str, (numberOfStudentsOccurrences == null) ? 1 : numberOfStudentsOccurrences + 1);
        }
        return studentsHashMap;
    }

    public EnumMap<Faculty, Integer> getFacultiesMap(ArrayList<Student> students) {
        for (Student str : students) {
            Integer studentsCountInFaculties = facultyEnumMap.get(str.getFaculty());
            facultyEnumMap.put(str.getFaculty(), (studentsCountInFaculties == null) ? 1 : studentsCountInFaculties + 1);
        }
        return facultyEnumMap;
    }

    public void printStudentsMap(HashMap<Student, Integer> hashMap) {
        for (HashMap.Entry<Student, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue());
        }
    }

    public void printFacultiesMap(EnumMap<Faculty, Integer> enumMap) {
        for (HashMap.Entry<Faculty, Integer> entry : enumMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
