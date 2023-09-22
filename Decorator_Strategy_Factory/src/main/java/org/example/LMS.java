package org.example;

interface LMS {
    void login(String username);
    void viewCourse(String courseName);
    void submitAssignment(String courseName, String assignmentName);
    void uploadCourseMaterial(String materialType, String title);
    void uploadCourseMaterialviaNotification(String materialType, String title);

    void ViewGrade();
}
