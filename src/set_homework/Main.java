package set_homework;

import set_homework.models.Coffee;
import set_homework.models.Glasses;
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

        System.out.print("\n");
        SortedTreeSet<Coffee> coffeeSortedTreeSet = new SortedTreeSet<>();
        coffeeSortedTreeSet.add(new Coffee("Black", "Arabica", "Brazil"));
        coffeeSortedTreeSet.add(new Coffee("Black", "Robusta", "Colombia"));
        coffeeSortedTreeSet.add(new Coffee("Brown", "Nescaffe", "Peru"));
        System.out.println(coffeeSortedTreeSet.contains(new Coffee("Black", "Arabica", "Brazil")));
        System.out.println(coffeeSortedTreeSet.getSize());
        coffeeSortedTreeSet.print();
        coffeeSortedTreeSet.remove(new Coffee("Black", "Arabica", "Brazil"));
        System.out.print("\n");
        coffeeSortedTreeSet.print();

        System.out.print("\n");
        SortedTreeSet<Glasses> glassesSortedTreeSet = new SortedTreeSet<>();
        glassesSortedTreeSet.add(new Glasses("Optical", "Ray-Ban", "male"));
        glassesSortedTreeSet.add(new Glasses("Sun", "Lacoste", "female"));
        glassesSortedTreeSet.add(new Glasses("Optical", "Porsche", "female"));
        System.out.println(glassesSortedTreeSet.contains(new Glasses("Sun", "Lacoste", "female")));
        System.out.println(glassesSortedTreeSet.getSize());
        glassesSortedTreeSet.print();
        glassesSortedTreeSet.remove(new Glasses("Sun", "Lacoste", "female"));
        System.out.print("\n");
        glassesSortedTreeSet.print();

    }
}
