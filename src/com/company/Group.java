package com.company;

import com.company.exceptions.NoStudentException;

public class Group {
    private String groupName;
    private int studentCount;
    private Student[] students;

    public Group(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudents(Student[] students) throws NoStudentException {
        this.students = students;
        if (studentCount == 0) {
            throw new NoStudentException();
        }
    }
}
