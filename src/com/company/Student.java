package com.company;

import com.company.exceptions.NoSubjectException;

public class Student {
    private String firstName;
    private String lastName;
    private int subjectCount;

    public Student(StudentBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        subjectCount = builder.subjectCount;
        if (subjectCount == 0) {
            try {
                throw new NoSubjectException();
            } catch (NoSubjectException e){
                e.printStackTrace();
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int subjectCount;

        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Student.StudentBuilder subjectCount(int subjectCount) {
            this.subjectCount = subjectCount;
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

}
