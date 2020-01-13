package com.company;

import com.company.exceptions.GradeException;

public class Subject {
    private String subjectName;
    private int grade;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(int grade) throws GradeException {
        if (grade < 0 || grade > 10) {
            throw new GradeException();
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