package com.university_project;

import com.university_project.exceptions.NoFacultyException;

public class University {
    private String universityName;
    private Faculty[] faculties;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFaculties(Faculty[] faculties) {
        if (faculties.length == 0) {
            throw new NoFacultyException("University has no faculties");
        }
        this.faculties = faculties;
    }
}
