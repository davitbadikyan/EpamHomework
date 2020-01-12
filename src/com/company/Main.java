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
                .subjectCount(1)
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
                .subjectCount(1)
                .build();
        physicsFacultySecondGradeStudents[1] = physicsStudent4;

        Student[] philosophyFacultyFirstGradeStudents = new Student[philosophyFirstGrade.getStudentCount()];
        Student philosophyStudent1 = new Student.StudentBuilder("Davit", "Davtyan")
                .subjectCount(2)
                .build();
        philosophyFacultyFirstGradeStudents[0] = philosophyStudent1;
        Student philosophyStudent2 = new Student.StudentBuilder("Lusine", "Meliqyan")
                .subjectCount(1)
                .build();
        philosophyFacultyFirstGradeStudents[1] = philosophyStudent2;

        Student[] philosophyFacultySecondGradeStudents = new Student[physicsSecondGrade.getStudentCount()];
        Student philosophyStudent3 = new Student.StudentBuilder("Yana", "Gharibyan")
                .subjectCount(2)
                .build();
        philosophyFacultySecondGradeStudents[0] = philosophyStudent3;
        Student philosophyStudent4 = new Student.StudentBuilder("Gevorg", "Meliqjanyan")
                .subjectCount(1)
                .build();
        philosophyFacultySecondGradeStudents[1] = philosophyStudent4;

        //Adding Subjects
        Subject[] subjectsOfPoxosPoxosyan = new Subject[physicsStudent1.getSubjectCount()];
        Subject mathOfPoxosPoxosyan = new Subject.SubjectBuilder("Math")
                .grade(8)
                .build();
        subjectsOfPoxosPoxosyan[0] = mathOfPoxosPoxosyan;

        Subject[] subjectsOfPetrosPetrosyan = new Subject[physicsStudent2.getSubjectCount()];
        Subject mathOfPetrosPetrosyan = new Subject.SubjectBuilder("Math")
                .grade(9)
                .build();
        subjectsOfPetrosPetrosyan[0] = mathOfPetrosPetrosyan;

        Subject physicsOfPetrosPetrosyan = new Subject.SubjectBuilder("Physics")
                .grade(6)
                .build();
        subjectsOfPetrosPetrosyan[1] = physicsOfPetrosPetrosyan;

        Subject[] subjectsOfAnnaSargsyan = new Subject[physicsStudent3.getSubjectCount()];
        Subject mathOfAnnaSargsyan = new Subject.SubjectBuilder("Math")
                .grade(7)
                .build();
        subjectsOfAnnaSargsyan[0] = mathOfAnnaSargsyan;

        Subject physicsOfAnnaSargsyan = new Subject.SubjectBuilder("Physics")
                .grade(10)
                .build();
        subjectsOfAnnaSargsyan[1] = physicsOfAnnaSargsyan;

        Subject[] subjectsOfMaratXaratyan = new Subject[physicsStudent4.getSubjectCount()];
        Subject mathOfMaratXaratyan = new Subject.SubjectBuilder("Math")
                .grade(5)
                .build();
        subjectsOfMaratXaratyan[0] = mathOfMaratXaratyan;

        Subject[] subjectsOfDavitDavtyan = new Subject[philosophyStudent1.getSubjectCount()];
        Subject philosophyOfDavitDavtyan = new Subject.SubjectBuilder("Philosophy")
                .grade(7)
                .build();
        subjectsOfDavitDavtyan[0] = philosophyOfDavitDavtyan;

        Subject mathOfDavidDavtyan = new Subject.SubjectBuilder("Math")
                .grade(4)
                .build();
        subjectsOfDavitDavtyan[1] = mathOfDavidDavtyan;

        Subject[] subjectsOfLusineMeliqyan = new Subject[philosophyStudent2.getSubjectCount()];
        Subject philosophyOfLusineMeliqyan = new Subject.SubjectBuilder("Philosophy")
                .grade(10)
                .build();
        subjectsOfLusineMeliqyan[0] = philosophyOfLusineMeliqyan;

        Subject[] subjectsOfYanaGharibyan = new Subject[philosophyStudent3.getSubjectCount()];
        Subject mathOfYanaGharibyan = new Subject.SubjectBuilder("Math")
                .grade(9)
                .build();
        subjectsOfYanaGharibyan[0] = mathOfYanaGharibyan;

        Subject philosophyOfYanaGharibyan = new Subject.SubjectBuilder("Philosophy")
                .grade(10)
                .build();
        subjectsOfYanaGharibyan[1] = philosophyOfYanaGharibyan;

        Subject[] subjectsOfGevorgMeliqjanyan = new Subject[philosophyStudent4.getSubjectCount()];
        Subject philosophyOfGevorgMeliqjanyan = new Subject.SubjectBuilder("Philosophy")
                .grade(6)
                .build();
        subjectsOfGevorgMeliqjanyan[0] = philosophyOfGevorgMeliqjanyan;
    }

}
