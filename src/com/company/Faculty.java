package com.company;

import com.company.exceptions.NoGroupException;

public class Faculty {
    private String facultyName;
    private int groupCount;
    private Group[] groups;

    public Faculty(String facultyName, int groupCount) {
        this.facultyName = facultyName;
        this.groupCount = groupCount;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroups(Group[] groups) throws NoGroupException {
        this.groups = groups;
        if (groupCount == 0) {
            throw new NoGroupException();
        }
    }
}
