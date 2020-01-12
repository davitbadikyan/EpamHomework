package com.company;

import com.company.exceptions.NoStudentException;

public class Group {
    private String groupName;
    private int studentCount;

    private Group(Group.GroupBuilder builder) {
        groupName = builder.groupName;
        studentCount = builder.studentCount;
        if (studentCount == 0) {
            try {
                throw new NoStudentException();
            } catch (NoStudentException e){
                e.printStackTrace();
            }
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static class GroupBuilder {
        private String groupName;
        private int studentCount;

        public GroupBuilder(String groupName) {
            this.groupName = groupName;
        }

        public Group.GroupBuilder studentCount(int studentCount) {
            this.studentCount = studentCount;
            return this;
        }

        public Group build() {
            Group group = new Group(this);
            return group;
        }
    }
}
