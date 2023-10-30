package org.example;

public class Facade {

    private AttendanceManagement attendanceManagement;
    private CourseManagement courseManagement;
    private StudentManagement studentManagement;

    public Facade(){
        this.attendanceManagement = new AttendanceManagement();
        this.courseManagement = new CourseManagement();
        this.studentManagement = new StudentManagement();
    }
public void ViewStudentInfo (String studentName, String courseID)
{
    studentManagement.showDetails(studentName,courseID);
}

public void ViewCourseDetails(String courseID, String courseName){
        courseManagement.showDetails(courseID,courseName);
}
public void ViewAttendance(String studentName, String courseID){
        attendanceManagement.showDetails(studentName,courseID);
}
}
