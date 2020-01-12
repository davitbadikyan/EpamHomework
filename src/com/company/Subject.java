package com.company;

import com.company.exceptions.GradeException;

public class Subject {
    private String subjectName;
    private int grade;

    public Subject(SubjectBuilder builder) {
        subjectName = builder.subjectName;
        grade = builder.grade;
        if (grade < 0 || grade > 10) {
            try {
                throw new GradeException();
            } catch (GradeException e) {
                e.printStackTrace();
            }
        }

    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }

    public static class SubjectBuilder {
        private String subjectName;
        private int grade;

        public SubjectBuilder(String subjectName) {
            this.subjectName = subjectName;
        }

        public Subject.SubjectBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Subject build() {
            Subject subject = new Subject(this);
            return subject;
        }
    }
}
