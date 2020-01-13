package com.company;

import com.company.exceptions.NoFacultyException;

public class University {
    private String universityName;
    private int facultyCount;
    private Faculty[] faculties;

    public University(String universityName, int facultyCount) throws NoFacultyException {
        this.universityName = universityName;
        this.facultyCount = facultyCount;
        if (facultyCount == 0) {
            throw new NoFacultyException();
        }
    }

    public String getUniversityName() {
        return universityName;
    }

    public int getFacultyCount() {
        return facultyCount;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }
}
