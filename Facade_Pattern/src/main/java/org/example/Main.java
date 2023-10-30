package org.example;


public class Main {
    public static void main(String[] args) {

        Facade lmsfacade = new Facade();

        lmsfacade.ViewCourseDetails("SWE4502","Design Patterns Lab");
        lmsfacade.ViewStudentInfo("A","SWE4502");
        lmsfacade.ViewAttendance("A","SWE4502");

        System.out.println();

        lmsfacade.ViewCourseDetails("SWE4501","Design Patterns");
        lmsfacade.ViewStudentInfo("A","SWE4501");
        lmsfacade.ViewAttendance("A","SWE4501");

        }
    }
