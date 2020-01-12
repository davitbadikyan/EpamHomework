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
    }
}
