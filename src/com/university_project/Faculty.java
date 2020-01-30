package com.university_project;

import com.university_project.exceptions.NoGroupException;

public class Faculty {
    private String facultyName;
    private Group[] groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups) {
        if (groups.length == 0) {
            throw new NoGroupException("Faculty has no groups");
        }
        this.groups = groups;
    }
}
