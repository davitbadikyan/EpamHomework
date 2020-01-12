package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private int subjectCount;

    public Student(StudentBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        subjectCount = builder.subjectCount;
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
