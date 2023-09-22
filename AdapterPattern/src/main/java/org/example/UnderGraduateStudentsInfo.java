package org.example;

public class UnderGraduateStudentsInfo implements StudentInformationSystem{

    @Override
    public void RetrievingStudentType(String name) {
        System.out.println(name + " is an under graduate student");

    }

    @Override
    public void RetrievingStudentsProgramme(String name) {
        System.out.println(name + " is pursuing SWE");

    }
}
