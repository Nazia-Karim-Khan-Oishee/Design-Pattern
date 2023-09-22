package org.example;

public interface LMS {
    void RetrieveStudentInfo(String name);
    void SubmitAssignment(String name,String CourseID);

    void ViewGrading(String CourseID);
}
