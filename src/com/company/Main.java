package com.company;

public class Main {
    public static void main(String[] args) {
        //Adding University
        University university = new University.UniversityBuilder("RAU")
                .facultyCount(2)
                .build();

        //Adding Faculties
        Faculty[] faculties = new Faculty[university.getFacultyCount()];
        Faculty physics = new Faculty.FacultyBuilder("Physics")
                .groupCount(2)
                .build();
        faculties[0] = physics;
        Faculty philosophy = new Faculty.FacultyBuilder("Philosophy")
                .groupCount(2)
                .build();
        faculties[1] = philosophy;

        //Adding Groups
        Group[] physicsFacultyGroups = new Group[physics.getGroupCount()];
        Group physicsFirstGrade = new Group.GroupBuilder("Physics First Grade")
                .studentCount(2)
                .build();
        physicsFacultyGroups[0] = physicsFirstGrade;
        Group physicsSecondGrade = new Group.GroupBuilder("Physics Second Grade")
                .studentCount(2)
                .build();
        physicsFacultyGroups[1] = physicsSecondGrade;

        Group[] philosophyFacultyGroups = new Group[philosophy.getGroupCount()];
        Group philosophyFirstGrade = new Group.GroupBuilder("Philosophy First Grade")
                .studentCount(2)
                .build();
        philosophyFacultyGroups[0] = philosophyFirstGrade;
        Group philosophySecondGrade = new Group.GroupBuilder("Philosophy Second Grade")
                .studentCount(2)
                .build();
        philosophyFacultyGroups[1] = philosophySecondGrade;

        //Adding Students
        Student[] physicsFacultyFirstGradeStudents = new Student[physicsFirstGrade.getStudentCount()];
        Student physicsStudent1 = new Student.StudentBuilder("Poxos", "Poxosyan")
                .subjectCount(2)
                .build();
        physicsFacultyFirstGradeStudents[0] = physicsStudent1;
        Student physicsStudent2 = new Student.StudentBuilder("Petros", "Petrosyan")
                .subjectCount(2)
                .build();
        physicsFacultyFirstGradeStudents[1] = physicsStudent2;

        Student[] physicsFacultySecondGradeStudents = new Student[physicsSecondGrade.getStudentCount()];
        Student physicsStudent3 = new Student.StudentBuilder("Anna", "Sargsyan")
                .subjectCount(2)
                .build();
        physicsFacultySecondGradeStudents[0] = physicsStudent3;
        Student physicsStudent4 = new Student.StudentBuilder("Marat", "Xaratyan")
                .subjectCount(2)
                .build();
        physicsFacultySecondGradeStudents[1] = physicsStudent4;

        Student[] philosophyFacultyFirstGradeStudents = new Student[philosophyFirstGrade.getStudentCount()];
        Student philosophyStudent1 = new Student.StudentBuilder("Davit", "Davtyan")
                .subjectCount(2)
                .build();
        philosophyFacultyFirstGradeStudents[0] = philosophyStudent1;
        Student philosophyStudent2 = new Student.StudentBuilder("Lusine", "Meliqyan")
                .subjectCount(2)
                .build();
        philosophyFacultyFirstGradeStudents[1] = philosophyStudent2;

        Student[] philosophyFacultySecondGradeStudents = new Student[physicsSecondGrade.getStudentCount()];
        Student philosophyStudent3 = new Student.StudentBuilder("Yana", "Gharibyan")
                .subjectCount(2)
                .build();
        philosophyFacultySecondGradeStudents[0] = philosophyStudent3;
        Student philosophyStudent4 = new Student.StudentBuilder("Gevorg", "Meliqjanyan")
                .subjectCount(2)
                .build();
        philosophyFacultySecondGradeStudents[1] = philosophyStudent4;
    }

}
