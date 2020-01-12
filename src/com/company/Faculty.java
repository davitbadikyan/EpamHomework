package com.company;

public class Faculty {
    private String facultyName;
    private int groupCount;

    private Faculty(Faculty.FacultyBuilder builder) {
        facultyName = builder.facultyName;
        groupCount = builder.groupCount;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public static class FacultyBuilder {
        private String facultyName;
        private int groupCount;

        public FacultyBuilder(String facultyName) {
            this.facultyName = facultyName;
        }

        public Faculty.FacultyBuilder groupCount(int groupCount) {
            this.groupCount = groupCount;
            return this;
        }

        public Faculty build() {
            Faculty faculty = new Faculty(this);
            return faculty;
        }
    }

}
