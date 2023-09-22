package org.example;

public class Moodle implements LMS{

    LMSAdapter lmsAdapter;

    public Moodle(LMSAdapter lmsAdapter)
    {
        this.lmsAdapter=lmsAdapter;
    }
    @Override
    public void RetrieveStudentInfo(String name) {
        lmsAdapter.RetrieveStudentInfo(name);

    }

    @Override
    public void SubmitAssignment(String name,String CourseID) {
        lmsAdapter.SubmitAssignment(name,CourseID);

    }

    @Override
    public void ViewGrading(String CourseID) {
       lmsAdapter.ViewGrading(CourseID);

    }

}
