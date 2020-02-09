package set_homework;

import set_homework.models.Student;

public class Main {
    public static void main(String[] args) {
        SortedTreeSet<Student> studentSortedTreeSet = new SortedTreeSet<>();
        studentSortedTreeSet.add(new Student("Karine", "Gevorgyan", 18));
        studentSortedTreeSet.add(new Student("Armen", "Davtyan", 23));
        studentSortedTreeSet.add(new Student("Armen", "Davtyan", 30));
        studentSortedTreeSet.add(new Student("Marat", "Sargsyan", 21));
        studentSortedTreeSet.add(new Student("Davit", "Martirosyan", 22));
        System.out.println(studentSortedTreeSet.contains(new Student("Armen", "Davtyan", 30)));
        System.out.println(studentSortedTreeSet.getSize());
        studentSortedTreeSet.print();
        studentSortedTreeSet.remove(new Student("Armen", "Davtyan", 30));
        System.out.print("\n");
        studentSortedTreeSet.print();



    }
}
