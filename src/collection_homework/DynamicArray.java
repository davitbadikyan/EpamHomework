package collection_homework;

public class DynamicArray {
    private Student[] students;
    private int size;
    private int capacity;

    public DynamicArray() {
        students = new Student[1];
        capacity = 1;
        size = 0;
    }

    public boolean add(Student student) {
        if (capacity == size) {
            capacityDoubling();
        }
        students[size] = student;
        size++;
        return true;
    }

    public boolean remove(Student student) {
        if (size != 0){
            for (int i = 0; i < size; i++) {
                if (student.equals(students[i])) {
                    Student temp = students[i];
                    for (int j = i; j < size - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[size - 1] = null;
                    size--;
                    System.out.println("deleted " + temp);
                    return true;
                }
            }
        }
        return false;
    }

    private void capacityDoubling() {
        Student[] temp = null;
        if (capacity == size) {
            temp = new Student[capacity * 2];
            for (int i = 0; i < capacity; i++) {
                temp[i] = students[i];
            }
        }
        students = temp;
        capacity = capacity * 2;
    }

    public int size() {
        return size;
    }

    public Student get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return students[index];
    }

    public void printElements() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
}

