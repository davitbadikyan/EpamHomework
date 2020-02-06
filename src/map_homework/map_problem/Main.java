package map_homework.map_problem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Diana", "Asatryan", Faculty.MATH));
        students.add(new Student("Diana", "Asatryan", Faculty.PHYSICS));
        students.add(new Student("Diana", "Asatryan", Faculty.PHILOSOPHY));
        students.add(new Student("Karen", "Balayan", Faculty.MATH));
        students.add(new Student("Karen", "Balayan", Faculty.PHILOSOPHY));
        students.add(new Student("Elen", "Mirzoyan", Faculty.ENGLISH));

        service.printStudentsMap(service.getStudentsMap(students));
        service.printFacultiesMap(service.getFacultiesMap(students));

    }

}
