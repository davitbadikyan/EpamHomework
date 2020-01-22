package collection_homework.second_problem;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Poxos", "Poxosyan", 19));
        students.add(new Student("Arsen", "Xachatryan", 21));
        students.add(new Student("Karen", "Manasyan", 17));
        students.add(new Student("David", "Karapetyan", 13));
        students.add(new Student("Suren", "Araqelyan", 38));
        students.add(new Student("Levon", "Altunyan", 29));
        students.add(new Student("Ashot", "Sargsyan", 27));
        students.add(new Student("Petros", "Hakobyan", 64));
        students.add(new Student("Narek", "Asatryan", 48));
        students.add(new Student("Vardan", "Petrosyan", 22));
        Collections.sort(students);
        for(Student str: students){
            System.out.println(str);
        }
    }
}
