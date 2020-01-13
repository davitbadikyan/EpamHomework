package com.company;

import com.company.exceptions.NoFacultyException;

public class University {
    private String universityName;
    private int facultyCount;
    private Faculty[] faculties;

    public University(String universityName, int facultyCount) {
        this.universityName = universityName;
        this.facultyCount = facultyCount;
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getFacultyCount() {
        return facultyCount;
    }

    public void setFaculties(Faculty[] faculties) throws NoFacultyException {
        this.faculties = faculties;
        if (facultyCount == 0) {
            throw new NoFacultyException();
        }
    }
}
