package org.example;

public class Main {
    public static void main(String[] args) {

        StudentInformationSystem studentInformationSystem = new UnderGraduateStudentsInfo();

        LMSAdapter adapter = new LMSAdapter(studentInformationSystem);
        LMS moodle = new Moodle(adapter);
        LMS schoology = new Schoology(adapter);

        moodle.RetrieveStudentInfo("Y");
        moodle.SubmitAssignment("Y","SWE4502");
        moodle.ViewGrading("SWE4502");

        System.out.println();
        System.out.println();


        adapter.setSIS(new PostGraduateStudentsInfo());
        schoology.RetrieveStudentInfo("X");
        schoology.SubmitAssignment("X","CSE4502");
        schoology.ViewGrading("CSE4502");
    }


}

