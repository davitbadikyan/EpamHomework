package com.company;

import com.company.exceptions.NoGroupException;

public class Faculty {
    private String facultyName;
    private int groupCount;
    private Group[] groups;

    public Faculty(String facultyName, int groupCount) throws NoGroupException {
        this.facultyName = facultyName;
        this.groupCount = groupCount;
        if (groupCount == 0) {
            throw new NoGroupException();
        }
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;

    }
}
