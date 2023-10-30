package org.example;

class AttendanceManagement implements LMS {
    @Override
    public void showDetails(String studentName, String courseId) {
        System.out.println("Attendance marked for " + studentName + " in course " + courseId);
    }
}
