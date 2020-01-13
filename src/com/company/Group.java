package com.company;

import com.company.exceptions.NoStudentException;

public class Group {
    private String groupName;
    private int studentCount;
    private Student[] students;

    public Group(String groupName, int studentCount) throws NoStudentException {
        this.groupName = groupName;
        this.studentCount = studentCount;
        if (studentCount == 0) {
            throw new NoStudentException();
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
