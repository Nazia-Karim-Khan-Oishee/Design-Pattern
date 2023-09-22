package org.example;

public class LMSAdapter implements LMS{

    StudentInformationSystem recordsSystem;

    public LMSAdapter(StudentInformationSystem recordsSystem) {
        this.recordsSystem = recordsSystem;
    }

    public void setSIS(StudentInformationSystem recordsSystem)
    {
        this.recordsSystem = recordsSystem;

    }
    @Override
    public void RetrieveStudentInfo(String name) {
        this.recordsSystem.RetrievingStudentType(name);
        this.recordsSystem.RetrievingStudentsProgramme(name);

    }

    @Override
    public void SubmitAssignment(String name,String CourseID) {

//        System.out.println(name+ " is Retrieving Course Contents for " + CourseID );

        System.out.println(name + " is Submitting assignment for " + CourseID);
    }

    @Override
    public void ViewGrading(String CourseID) {
        System.out.println("Viewing grades for " + CourseID);
    }


}
