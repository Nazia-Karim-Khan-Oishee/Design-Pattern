package org.example;

public class Schoology implements LMS{
    private String institution_name;
private CourseFactory courseFactory;
    private StrategyContext gradingStrategy ;


    public Schoology(String institutionName, CourseFactory courseFactory,StrategyContext gradingStrategy) {
        this.institution_name = institutionName;
        this.courseFactory=courseFactory;
        this.gradingStrategy=gradingStrategy;
    }
    @Override
    public void login(String username) {
        System.out.println("Logged into Schoology as " + username + " at " + institution_name +"\n");
    }

    @Override
    public void viewCourse(String courseName) {
        System.out.println ("Viewing " + courseName + " on Schoology" );
    }

    @Override
    public void submitAssignment(String courseName, String assignmentName) {

        System.out.println ("Submitting " + assignmentName + " for " + courseName + " on Schoology. "+"\n");
    }

    @Override
    public void uploadCourseMaterial(String materialType, String title) {
        //upload materials without notification
        CourseMaterial courseMaterial = courseFactory.createCourseMaterial(materialType,title);
        System.out.println ("Uploaded" + courseMaterial.getDescription());



    }
@Override
    public void uploadCourseMaterialviaNotification(String materialType, String title){
    CourseMaterial courseMaterial = courseFactory.createCourseMaterialviaNotificatio(materialType,title);
        System.out.println ("Uploaded" + courseMaterial.getDescription() +"\n");
    }

    @Override
    public void ViewGrade(){
        gradingStrategy.SetStrategy(new GradingonAttendance());
        String grade = gradingStrategy.getGrade();
        System.out.println ("Viewing grade through Scoology "+ "\n"+ grade);

        gradingStrategy.SetStrategy(new GradingonAttendance());
         grade = gradingStrategy.getGrade();
        System.out.println (grade);

    }
}
