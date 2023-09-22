package org.example;

public class PostGraduateStudentsInfo implements StudentInformationSystem{


    @Override
    public void RetrievingStudentType(String name) {
        System.out.println(name + " is a post graduate student");

    }

    @Override
    public void RetrievingStudentsProgramme(String name) {
        System.out.println(name + " is pursuing CSE");

    }
}
