package org.example;

public class StudentManagement implements LMS{

@Override
    public void showDetails(String studentName, String courseId) {
        System.out.println(studentName + " has enrolled in course " + courseId);
    }


}
