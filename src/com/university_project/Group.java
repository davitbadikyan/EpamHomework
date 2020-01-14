package com.university_project;

import com.university_project.exceptions.NoStudentException;

public class Group {
    private String groupName;
    private Student[] students;

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setStudents(Student[] students) {
        if (students.length == 0) {
            throw new NoStudentException("Group has no students");
        }
        this.students = students;
    }
}
