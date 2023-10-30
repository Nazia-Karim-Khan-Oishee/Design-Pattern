package org.example;

public class CourseManagement implements LMS{

    @Override
    public void showDetails(String courseName,String courseId) {
            System.out.println("Course " + courseId + " - " + courseName + " has been created.");
        }



}
