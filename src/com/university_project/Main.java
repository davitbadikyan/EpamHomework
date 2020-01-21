package com.university_project;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.universityStructure();
        service.uniFromOneSubjectGPA("RAU", "Math");
        service.facultyFromOneSubjectGPA("Physics", "Math");
        service.groupFromOneSubjectGPA("Physics First Grade", "Math");
        service.oneStudentGPA(5);
    }

}
