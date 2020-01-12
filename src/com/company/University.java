package com.company;

import com.company.exceptions.NoFacultyException;

public class University {
    private String universityName;
    private int facultyCount;

    private University(UniversityBuilder builder) {
        universityName = builder.universityName;
        facultyCount = builder.facultyCount;
        if (facultyCount == 0){
            try {
                throw new NoFacultyException();
            } catch (NoFacultyException e) {
                e.printStackTrace();
            }
        }
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getFacultyCount() {
        return facultyCount;
    }

    public void NoFacultyExceptionCatcher() {

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
