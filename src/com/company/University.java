package com.company;

public class University {
    private String universityName;
    private int facultyCount;

    private University(UniversityBuilder builder) {
        universityName = builder.universityName;
        facultyCount = builder.facultyCount;
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getFacultyCount() {
        return facultyCount;
    }

    public static class UniversityBuilder {
        private String universityName;
        private int facultyCount;

        public UniversityBuilder(String universityName) {
            this.universityName = universityName;
        }

        public UniversityBuilder facultyCount(int facultyCount) {
            this.facultyCount = facultyCount;
            return this;
        }

        public University build() {
            University university = new University(this);
            return university;
        }
    }


}
