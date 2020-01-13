package com.company;

import com.company.exceptions.NoSubjectException;

public class Student {
    private String firstName;
    private String lastName;
    private String universityName;
    private String facultyName;
    private String groupName;
    private int subjectCount;
    private Subject[] subjects;

    public Subject[] getSubjects() {
        return subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public Student(StudentBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        universityName = builder.universityName;
        facultyName = builder.facultyName;
        groupName = builder.groupName;
        subjectCount = builder.subjectCount;


    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String universityName;
        private String facultyName;
        private String groupName;
        private int subjectCount;
        private Subject[] subjects;


        public StudentBuilder(String firstName, String lastName, String universityName, String facultyName, String groupName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.universityName = universityName;
            this.facultyName = facultyName;
            this.groupName = groupName;
        }

        public Student.StudentBuilder subjectCount(int subjectCount) throws NoSubjectException {
            this.subjectCount = subjectCount;
            if (subjectCount == 0) {
                throw new NoSubjectException();
            }
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

}
