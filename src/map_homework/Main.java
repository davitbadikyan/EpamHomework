package map_homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Diana", "Asatryan", "Math"));
        students.add(new Student("Diana", "Asatryan", "Physics"));
        students.add(new Student("Diana", "Asatryan", "Philosophy"));
        students.add(new Student("Karen", "Balayan", "Math"));
        students.add(new Student("Karen", "Balayan", "Philosophy"));
        students.add(new Student("Elen", "Mirzoyan", "English"));

        service.printStudentsMap(service.getStudentsMap(students));
        service.printFacultiesMap(service.getFacultiesMap(students));

    }

}
