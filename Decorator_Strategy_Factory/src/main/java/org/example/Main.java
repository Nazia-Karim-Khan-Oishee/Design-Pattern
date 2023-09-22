package org.example;

public class Main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        StrategyContext gradingStrategy=new StrategyContext();
        LMS schoologyLMS = new Schoology("IUT",courseFactory,gradingStrategy);
        LMS moodleLMS = new Moodle("Islamic University of Technology",courseFactory,gradingStrategy);

        schoologyLMS.login("student123");
        schoologyLMS.viewCourse("Design Patterns");
        schoologyLMS.submitAssignment("Design Pattern","Assignment 1");
        schoologyLMS.uploadCourseMaterial("Lecture","Decorator Pattern");
        schoologyLMS.uploadCourseMaterialviaNotification("Lecture","Decorator Pattern");
        schoologyLMS.ViewGrade();

        System.out.println("////////////////");

        moodleLMS.login("student321");
        moodleLMS.viewCourse("Design Patterns");
        moodleLMS.submitAssignment("Design Pattern","Assignment 1");
        moodleLMS.uploadCourseMaterial("Lecture","Decorator Pattern");
        moodleLMS.uploadCourseMaterialviaNotification("Lecture","Decorator Pattern");
        moodleLMS.ViewGrade();



    }
}
