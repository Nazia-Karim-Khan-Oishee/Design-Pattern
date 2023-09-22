package org.example;

class Moodle implements LMS {
    private String institutionName;
    private CourseFactory courseFactory;

    private StrategyContext gradingStrategy ;


    public Moodle(String institutionName, CourseFactory courseFactory,StrategyContext gradingStrategy) {
        this.institutionName = institutionName;
        this.courseFactory=courseFactory;
        this.gradingStrategy=gradingStrategy;
    }

    @Override
    public void login(String username) {
        System.out.println("Logged into Moodle as " + username + " at " + institutionName + "\n");
    }

    @Override
    public void viewCourse(String courseName) {
        System.out.println ("Viewing " + courseName + " on Moodle" );
    }

    @Override
    public void submitAssignment(String courseName, String assignmentName) {

        System.out.println ("Submitting " + assignmentName + " for " + courseName + " on Moodle. "+ "\n");
    }
    @Override
    public void uploadCourseMaterial(String materialType, String title) {
        CourseMaterial courseMaterial = courseFactory.createCourseMaterial(materialType,title);

        System.out.println ("Uploaded" + courseMaterial.getDescription());    }

    @Override
    public void uploadCourseMaterialviaNotification(String materialType, String title){
        CourseMaterial courseMaterial = courseFactory.createCourseMaterialviaNotificatio(materialType,title);
        System.out.println ("Uploaded" + courseMaterial.getDescription() +"\n");
    }

    @Override
    public void ViewGrade(){
        gradingStrategy.SetStrategy(new GradingonAttendance());
        String grade = gradingStrategy.getGrade();
        System.out.println ("Viewing grade through Moodle "+ "\n"+ grade);

        gradingStrategy.SetStrategy(new GradingonAttendance());
        grade = gradingStrategy.getGrade();
        System.out.println (grade);
    }
}