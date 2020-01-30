package com.university_project;

public class Service {
    private int allStudentsCount;
    private int inUniOneSubjectStudentsCount = 0;
    private int inUniOneSubjectAllGrade = 0;
    private double inUniOneSubjectAverage;
    private int inFacOneSubjectAllGrade = 0;
    private int inFacOneSubjectStudentsCount = 0;
    private double inFacOneSubjectAverage;
    private int inGroupOneSubjectAllGrade = 0;
    private int inGroupOneSubjectStudentsCount = 0;
    private double inGroupOneSubjectAverage;
    private double studentGpa;
    private Student[] allStudents;
    private Faculty[] faculties;
    private String facultyName;
    private String subjectName;


    public void universityStructure() {
        //Adding University
        try {
            University university = new University("RAU");

            //Adding Faculties
            Faculty physics = new Faculty("Physics");
            Faculty philosophy = new Faculty("Philosophy");
            this.faculties = new Faculty[]{physics, philosophy};
            university.setFaculties(faculties);

            //Adding Groups
            Group physicsFirstGrade = new Group("Physics First Grade");
            Group physicsSecondGrade = new Group("Physics Second Grade");
            Group[] physicsFacultyGroups = new Group[]{physicsFirstGrade, physicsSecondGrade};
            physics.setGroups(physicsFacultyGroups);

            Group philosophyFirstGrade = new Group("Philosophy First Grade");
            Group philosophySecondGrade = new Group("Philosophy Second Grade");
            Group[] philosophyFacultyGroups = new Group[]{philosophyFirstGrade, philosophySecondGrade};
            philosophy.setGroups(philosophyFacultyGroups);

            //Adding Students
            Student physicsStudent1 = new Student.StudentBuilder("Poxos", "Poxosyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsFirstGrade.getGroupName())
                    .build();
            Student physicsStudent2 = new Student.StudentBuilder("Petros", "Petrosyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsFirstGrade.getGroupName())
                    .build();
            Student[] physicsFacultyFirstGradeStudents = new Student[]{physicsStudent1, physicsStudent2};
            physicsFirstGrade.setStudents(physicsFacultyFirstGradeStudents);

            Student physicsStudent3 = new Student.StudentBuilder("Anna", "Sargsyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsSecondGrade.getGroupName())
                    .build();
            Student physicsStudent4 = new Student.StudentBuilder("Marat", "Xaratyan",
                    university.getUniversityName(),
                    physics.getFacultyName(),
                    physicsSecondGrade.getGroupName())
                    .build();
            Student[] physicsFacultySecondGradeStudents = new Student[]{physicsStudent3, physicsStudent4};
            physicsSecondGrade.setStudents(physicsFacultySecondGradeStudents);


            Student philosophyStudent1 = new Student.StudentBuilder("Davit", "Davtyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophyFirstGrade.getGroupName())
                    .build();
            Student philosophyStudent2 = new Student.StudentBuilder("Lusine", "Meliqyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophyFirstGrade.getGroupName())
                    .build();
            Student[] philosophyFacultyFirstGradeStudents = new Student[]{philosophyStudent1, philosophyStudent2};
            philosophyFirstGrade.setStudents(philosophyFacultyFirstGradeStudents);

            Student philosophyStudent3 = new Student.StudentBuilder("Yana", "Gharibyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophySecondGrade.getGroupName())
                    .build();
            Student philosophyStudent4 = new Student.StudentBuilder("Gevorg", "Meliqjanyan",
                    university.getUniversityName(),
                    philosophy.getFacultyName(),
                    philosophySecondGrade.getGroupName())
                    .build();
            Student[] philosophyFacultySecondGradeStudents = new Student[]{philosophyStudent3, philosophyStudent4};
            philosophySecondGrade.setStudents(philosophyFacultySecondGradeStudents);


            //Adding Subjects
            Subject mathOfPoxosPoxosyan = new Subject("Math");
            mathOfPoxosPoxosyan.setGrade(8);
            Subject[] subjectsOfPoxosPoxosyan = new Subject[]{mathOfPoxosPoxosyan};
            physicsStudent1.setSubjects(subjectsOfPoxosPoxosyan);

            Subject mathOfPetrosPetrosyan = new Subject("Math");
            mathOfPetrosPetrosyan.setGrade(8);
            Subject physicsOfPetrosPetrosyan = new Subject("Physics");
            physicsOfPetrosPetrosyan.setGrade(8);
            Subject[] subjectsOfPetrosPetrosyan = new Subject[]{mathOfPetrosPetrosyan, physicsOfPetrosPetrosyan};
            physicsStudent2.setSubjects(subjectsOfPetrosPetrosyan);

            Subject mathOfAnnaSargsyan = new Subject("Math");
            mathOfAnnaSargsyan.setGrade(8);
            Subject physicsOfAnnaSargsyan = new Subject("Physics");
            physicsOfAnnaSargsyan.setGrade(8);
            Subject[] subjectsOfAnnaSargsyan = new Subject[]{mathOfAnnaSargsyan, physicsOfAnnaSargsyan};
            physicsStudent3.setSubjects(subjectsOfAnnaSargsyan);

            Subject mathOfMaratXaratyan = new Subject("Math");
            mathOfMaratXaratyan.setGrade(8);
            Subject[] subjectsOfMaratXaratyan = new Subject[]{mathOfMaratXaratyan};
            physicsStudent4.setSubjects(subjectsOfMaratXaratyan);

            Subject philosophyOfDavitDavtyan = new Subject("Philosophy");
            philosophyOfDavitDavtyan.setGrade(8);
            Subject mathOfDavidDavtyan = new Subject("Math");
            mathOfDavidDavtyan.setGrade(8);
            Subject[] subjectsOfDavitDavtyan = new Subject[]{philosophyOfDavitDavtyan, mathOfDavidDavtyan};
            philosophyStudent1.setSubjects(subjectsOfDavitDavtyan);

            Subject philosophyOfLusineMeliqyan = new Subject("Philosophy");
            philosophyOfLusineMeliqyan.setGrade(8);
            Subject[] subjectsOfLusineMeliqyan = new Subject[]{philosophyOfLusineMeliqyan};
            philosophyStudent2.setSubjects(subjectsOfLusineMeliqyan);

            Subject mathOfYanaGharibyan = new Subject("Math");
            mathOfYanaGharibyan.setGrade(8);
            Subject philosophyOfYanaGharibyan = new Subject("Philosophy");
            philosophyOfYanaGharibyan.setGrade(8);
            Subject[] subjectsOfYanaGharibyan = new Subject[]{mathOfYanaGharibyan, philosophyOfYanaGharibyan};
            philosophyStudent3.setSubjects(subjectsOfYanaGharibyan);

            Subject philosophyOfGevorgMeliqjanyan = new Subject("Philosophy");
            philosophyOfGevorgMeliqjanyan.setGrade(8);
            Subject[] subjectsOfGevorgMeliqjanyan = new Subject[]{philosophyOfGevorgMeliqjanyan};
            philosophyStudent4.setSubjects(subjectsOfGevorgMeliqjanyan);

            this.allStudentsCount = physicsFacultyFirstGradeStudents.length
                    + physicsFacultySecondGradeStudents.length
                    + philosophyFacultyFirstGradeStudents.length
                    + philosophyFacultySecondGradeStudents.length;
            this.allStudents = new Student[this.allStudentsCount];
            int pos = 0;
            for (Student element : physicsFacultyFirstGradeStudents) {
                allStudents[pos] = element;
                pos++;
            }
            for (Student element : physicsFacultySecondGradeStudents) {
                allStudents[pos] = element;
                pos++;
            }
            for (Student element : philosophyFacultyFirstGradeStudents) {
                allStudents[pos] = element;
                pos++;
            }
            for (Student element : philosophyFacultySecondGradeStudents) {
                allStudents[pos] = element;
                pos++;
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void uniFromOneSubjectGPA(String uniName, String subjectName) {
        for (int i = 0; i < allStudents.length; i++) {
            for (int j = 0; j < allStudents[i].getSubjects().length; j++) {
                if (allStudents[i].getUniversityName().equals(uniName)
                        && allStudents[i].
                        getSubjects()[j].getSubjectName().equals(subjectName)) {
                    inUniOneSubjectAllGrade += allStudents[i].getSubjects()[j].getGrade();
                    inUniOneSubjectStudentsCount++;
                }
            }
        }

        this.inUniOneSubjectAverage = inUniOneSubjectAllGrade / inUniOneSubjectStudentsCount;
        System.out.println("University's average grade from Math is " + this.inUniOneSubjectAverage);
    }

    public void facultyFromOneSubjectGPA(String facultyName, String subjectName) {
        for (int i = 0; i < allStudents.length; i++) {
            for (int j = 0; j < allStudents[i].getSubjects().length; j++) {
                if (allStudents[i].getFacultyName().equals(facultyName)
                        && allStudents[i].getSubjects()[j].getSubjectName().equals(subjectName)) {
                    inFacOneSubjectAllGrade += allStudents[i].getSubjects()[j].getGrade();
                    inFacOneSubjectStudentsCount++;
                }

            }
        }
        this.inFacOneSubjectAverage = inFacOneSubjectAllGrade / inFacOneSubjectStudentsCount;
        System.out.println("Faculty's average grade from Math is " + this.inFacOneSubjectAverage);
    }

    public void groupFromOneSubjectGPA(String groupName, String subjectName) {
        for (int i = 0; i < allStudents.length; i++) {
            for (int j = 0; j < allStudents[i].getSubjects().length; j++) {
                if (allStudents[i].getGroupName().equals(groupName)
                        && allStudents[i].getSubjects()[j].getSubjectName().equals(subjectName)) {
                    inGroupOneSubjectAllGrade += allStudents[i].getSubjects()[j].getGrade();
                    inGroupOneSubjectStudentsCount++;
                }
            }
        }
        this.inGroupOneSubjectAverage = inGroupOneSubjectAllGrade / inGroupOneSubjectStudentsCount;
        System.out.println("Groups's average grade from Math is " + this.inGroupOneSubjectAverage);
    }

    public void oneStudentGPA(int studentIndex) {
        for (int i = 0; i < allStudents[studentIndex].getSubjects().length; i++) {
            studentGpa += allStudents[studentIndex].getSubjects()[i].getGrade();
        }
        System.out.println("Current chosen student's GPA is " + this.studentGpa);
    }
}
