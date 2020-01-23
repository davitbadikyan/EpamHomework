package collection_homework;

public class DynamicArray {
    private Student students[];
    private int size;
    private int capacity;

    public DynamicArray() {
        students = new Student[1];
        capacity = 0;
        size = 1;
    }

    public boolean add(Student student) {
        if (capacity == size) {
            sizeDoubling();
        }
        students[capacity] = student;
        capacity++;
        return true;
    }

    public void remove(Student student) {
        for (int i = 0; i < size; i++) {
            if (student == students[i]) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
            }
        }
    }

    private void sizeDoubling() {
        Student temp[] = null;
        if (capacity == size) {
            temp = new Student[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = students[i];
            }
        }
        students = temp;
        size = size * 2;
    }

    public int size() {
        return size;
    }

    public void printElements() {
        for (Student str : students) {
            System.out.println(str);
        }
    }

    public Student get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return students[index];
    }
}

