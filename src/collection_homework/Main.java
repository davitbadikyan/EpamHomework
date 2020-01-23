package collection_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //First Problem
        ArrayList<Student> students = new ArrayList<>();
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

        Collections.sort(students, new AgeComparator());
        for(Student str: students){
            System.out.println(str);
        }
        System.out.println();
        Collections.sort(students, new NameComparator());
        for(Student str: students){
            System.out.println(str);
        }
        System.out.println();

        // Second Problem
        LinkedList<Student> studentsWithLinkedList = new LinkedList<>();
        studentsWithLinkedList.add(new Student("Poxos", "Poxosyan", 19));
        studentsWithLinkedList.add(new Student("Arsen", "Xachatryan", 21));
        studentsWithLinkedList.add(new Student("Karen", "Manasyan", 17));
        studentsWithLinkedList.add(new Student("David", "Karapetyan", 13));
        studentsWithLinkedList.add(new Student("Suren", "Araqelyan", 38));
        studentsWithLinkedList.add(new Student("Levon", "Altunyan", 29));
        studentsWithLinkedList.add(new Student("Ashot", "Sargsyan", 27));
        studentsWithLinkedList.add(new Student("Petros", "Hakobyan", 64));
        studentsWithLinkedList.add(new Student("Narek", "Asatryan", 48));
        studentsWithLinkedList.add(new Student("Vardan", "Petrosyan", 22));
        Collections.sort(studentsWithLinkedList);
        for(Student str: studentsWithLinkedList){
            System.out.println(str);
        }
        System.out.println();

        // problem N3 and initializing it
        Student s1 = new Student("Poxos", "Poxosyan", 19);
        Student s2 = new Student("Arsen", "Xachatryan", 21);
        Student s3 = new Student("Karen", "Manasyan", 17);
        Student s4 = new Student("David", "Karapetyan", 13);
        Student s5 = new Student("Suren", "Araqelyan", 38);
        DynamicArray studentsWithDynamic = new DynamicArray();
        studentsWithDynamic.add(s1);
        studentsWithDynamic.add(s2);
        studentsWithDynamic.add(s3);
        studentsWithDynamic.add(s4);
        studentsWithDynamic.add(s5);
        System.out.println(studentsWithDynamic.size());
        studentsWithDynamic.remove(s1);
        System.out.println();
        studentsWithDynamic.printElements();
        System.out.println();
        System.out.println(studentsWithDynamic.get(1));
    }
}
