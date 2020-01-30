package com.university_project;

import com.university_project.exceptions.GradeException;

public class Subject {
    private String subjectName;
    private int grade;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(int grade)  {
        if (grade < 0 || grade > 10) {
            throw new GradeException("Invalid grade");
        }
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }
}