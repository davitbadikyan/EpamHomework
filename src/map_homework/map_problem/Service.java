package map_homework.map_problem;

import java.util.ArrayList;
import java.util.HashMap;

public class Service {
    private HashMap<Student, Integer> studentsHashMap = new HashMap<>();
    private HashMap<String, Integer> facultiesHashMap = new HashMap<>();

    public HashMap<Student, Integer> getStudentsMap(ArrayList<Student> students) {
        for (Student str : students) {
            Integer numberOfStudentsOccurrences = studentsHashMap.get(str);
            studentsHashMap.put(str, (numberOfStudentsOccurrences == null) ? 1 : numberOfStudentsOccurrences + 1);
        }
        return studentsHashMap;
    }

    public HashMap<String, Integer> getFacultiesMap(ArrayList<Student> students) {
        for (Student str : students) {
            Integer studentsCountInFaculties = facultiesHashMap.get(str.getFaculty());
            facultiesHashMap.put(str.getFaculty(), (studentsCountInFaculties == null) ? 1 : studentsCountInFaculties + 1);
        }
        return facultiesHashMap;
    }

    public void printStudentsMap(HashMap<Student, Integer> hashMap) {
        for (HashMap.Entry<Student, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().toString() + " " + entry.getValue());
        }
    }

    public void printFacultiesMap(HashMap<String, Integer> hashMap) {
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
