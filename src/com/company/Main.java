package com.company;

public class Main {
    public static void main(String[] args) {
        //Making University
        University university = new University.UniversityBuilder("RAU")
                .facultyCount(2)
                .build();

        //Making Faculties
        Faculty[] faculties = new Faculty[university.getFacultyCount()];
        Faculty physics = new Faculty.FacultyBuilder("Physics")
                .groupCount(2)
                .build();
        faculties[0] = physics;
        Faculty philosophy = new Faculty.FacultyBuilder("Philosophy")
                .groupCount(2)
                .build();
        faculties[1] = philosophy;

        //Making Groups
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
    }
}
