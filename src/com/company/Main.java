package com.company;

import com.company.exceptions.*;

public class Main {
    public static void main(String[] args) {
        //Adding University
        try {
            University university = new University("RAU", 2);

            //Adding Faculties
            Faculty[] faculties = new Faculty[university.getFacultyCount()];
            Faculty physics = new Faculty("Physics", 2);
            faculties[0] = physics;
            Faculty philosophy = new Faculty("Philosophy", 2);
            faculties[1] = philosophy;
            university.setFaculties(faculties);

            //Adding Groups
            Group[] physicsFacultyGroups = new Group[physics.getGroupCount()];
            Group physicsFirstGrade = new Group("Physics First Grade", 2);
            physicsFacultyGroups[0] = physicsFirstGrade;
            Group physicsSecondGrade = new Group("Physics Second Grade", 2);
            physicsFacultyGroups[1] = physicsSecondGrade;
            physics.setGroups(physicsFacultyGroups);

            Group[] philosophyFacultyGroups = new Group[philosophy.getGroupCount()];
            Group philosophyFirstGrade = new Group("Philosophy First Grade", 2);
            philosophyFacultyGroups[0] = philosophyFirstGrade;
            Group philosophySecondGrade = new Group("Philosophy Second Grade", 2);
            philosophyFacultyGroups[1] = philosophySecondGrade;
            philosophy.setGroups(philosophyFacultyGroups);

            //Adding Students
            Student[] physicsFacultyFirstGradeStudents = new Student[physicsFirstGrade.getStudentCount()];
            Student physicsStudent1 = new Student.StudentBuilder("Poxos", "Poxosyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsFirstGrade.getGroupName())
                    .subjectCount(1)
                    .build();
            physicsFacultyFirstGradeStudents[0] = physicsStudent1;
            Student physicsStudent2 = new Student.StudentBuilder("Petros", "Petrosyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsFirstGrade.getGroupName())
                    .subjectCount(2)
                    .build();
            physicsFacultyFirstGradeStudents[1] = physicsStudent2;
            physicsFirstGrade.setStudents(physicsFacultyFirstGradeStudents);

            Student[] physicsFacultySecondGradeStudents = new Student[physicsSecondGrade.getStudentCount()];
            Student physicsStudent3 = new Student.StudentBuilder("Anna", "Sargsyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsSecondGrade.getGroupName())
                    .subjectCount(2)
                    .build();
            physicsFacultySecondGradeStudents[0] = physicsStudent3;
            Student physicsStudent4 = new Student.StudentBuilder("Marat", "Xaratyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsSecondGrade.getGroupName())
                    .subjectCount(1)
                    .build();
            physicsFacultySecondGradeStudents[1] = physicsStudent4;
            physicsSecondGrade.setStudents(physicsFacultySecondGradeStudents);


            Student[] philosophyFacultyFirstGradeStudents = new Student[philosophyFirstGrade.getStudentCount()];
            Student philosophyStudent1 = new Student.StudentBuilder("Davit", "Davtyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophyFirstGrade.getGroupName())
                    .subjectCount(2)
                    .build();
            philosophyFacultyFirstGradeStudents[0] = philosophyStudent1;
            Student philosophyStudent2 = new Student.StudentBuilder("Lusine", "Meliqyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophyFirstGrade.getGroupName())
                    .subjectCount(1)
                    .build();
            philosophyFacultyFirstGradeStudents[1] = philosophyStudent2;
            philosophyFirstGrade.setStudents(philosophyFacultyFirstGradeStudents);

            Student[] philosophyFacultySecondGradeStudents = new Student[physicsSecondGrade.getStudentCount()];
            Student philosophyStudent3 = new Student.StudentBuilder("Yana", "Gharibyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophySecondGrade.getGroupName())
                    .subjectCount(2)
                    .build();
            philosophyFacultySecondGradeStudents[0] = philosophyStudent3;
            Student philosophyStudent4 = new Student.StudentBuilder("Gevorg", "Meliqjanyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophySecondGrade.getGroupName())
                    .subjectCount(1)
                    .build();
            philosophyFacultySecondGradeStudents[1] = philosophyStudent4;
            philosophySecondGrade.setStudents(philosophyFacultySecondGradeStudents);


            //Adding Subjects
            Subject[] subjectsOfPoxosPoxosyan = new Subject[physicsStudent1.getSubjectCount()];
            Subject mathOfPoxosPoxosyan = new Subject("Math");
            mathOfPoxosPoxosyan.setGrade(8);
            subjectsOfPoxosPoxosyan[0] = mathOfPoxosPoxosyan;
            physicsStudent1.setSubjects(subjectsOfPoxosPoxosyan);

            Subject[] subjectsOfPetrosPetrosyan = new Subject[physicsStudent2.getSubjectCount()];
            Subject mathOfPetrosPetrosyan = new Subject("Math");
            mathOfPetrosPetrosyan.setGrade(8);
            subjectsOfPetrosPetrosyan[0] = mathOfPetrosPetrosyan;
            Subject physicsOfPetrosPetrosyan = new Subject("Physics");
            physicsOfPetrosPetrosyan.setGrade(8);
            subjectsOfPetrosPetrosyan[1] = physicsOfPetrosPetrosyan;
            physicsStudent2.setSubjects(subjectsOfPetrosPetrosyan);

            Subject[] subjectsOfAnnaSargsyan = new Subject[physicsStudent3.getSubjectCount()];
            Subject mathOfAnnaSargsyan = new Subject("Math");
            mathOfAnnaSargsyan.setGrade(8);
            subjectsOfAnnaSargsyan[0] = mathOfAnnaSargsyan;
            Subject physicsOfAnnaSargsyan = new Subject("Physics");
            physicsOfAnnaSargsyan.setGrade(8);
            subjectsOfAnnaSargsyan[1] = physicsOfAnnaSargsyan;
            physicsStudent3.setSubjects(subjectsOfAnnaSargsyan);

            Subject[] subjectsOfMaratXaratyan = new Subject[physicsStudent4.getSubjectCount()];
            Subject mathOfMaratXaratyan = new Subject("Math");
            subjectsOfMaratXaratyan[0] = mathOfMaratXaratyan;
            physicsStudent4.setSubjects(subjectsOfMaratXaratyan);

            Subject[] subjectsOfDavitDavtyan = new Subject[philosophyStudent1.getSubjectCount()];
            Subject philosophyOfDavitDavtyan = new Subject("Philosophy");
            philosophyOfDavitDavtyan.setGrade(8);
            subjectsOfDavitDavtyan[0] = philosophyOfDavitDavtyan;
            Subject mathOfDavidDavtyan = new Subject("Math");
            mathOfDavidDavtyan.setGrade(8);
            subjectsOfDavitDavtyan[1] = mathOfDavidDavtyan;
            philosophyStudent1.setSubjects(subjectsOfDavitDavtyan);

            Subject[] subjectsOfLusineMeliqyan = new Subject[philosophyStudent2.getSubjectCount()];
            Subject philosophyOfLusineMeliqyan = new Subject("Philosophy");
            philosophyOfLusineMeliqyan.setGrade(8);
            subjectsOfLusineMeliqyan[0] = philosophyOfLusineMeliqyan;
            philosophyStudent2.setSubjects(subjectsOfLusineMeliqyan);

            Subject[] subjectsOfYanaGharibyan = new Subject[philosophyStudent3.getSubjectCount()];
            Subject mathOfYanaGharibyan = new Subject("Math");
            mathOfYanaGharibyan.setGrade(8);
            subjectsOfYanaGharibyan[0] = mathOfYanaGharibyan;
            Subject philosophyOfYanaGharibyan = new Subject("Philosophy");
            philosophyOfYanaGharibyan.setGrade(8);
            subjectsOfYanaGharibyan[1] = philosophyOfYanaGharibyan;
            philosophyStudent3.setSubjects(subjectsOfYanaGharibyan);

            Subject[] subjectsOfGevorgMeliqjanyan = new Subject[philosophyStudent4.getSubjectCount()];
            Subject philosophyOfGevorgMeliqjanyan = new Subject("Philosophy");
            philosophyOfGevorgMeliqjanyan.setGrade(8);
            subjectsOfGevorgMeliqjanyan[0] = philosophyOfGevorgMeliqjanyan;
            philosophyStudent4.setSubjects(subjectsOfGevorgMeliqjanyan);
        } catch (GradeException | NoFacultyException | NoGroupException | NoStudentException | NoSubjectException e) {
            System.out.println(e);
        }
    }

}
