package org.example;

abstract class NotificationDecorator implements CourseMaterial {
    private CourseMaterial material;
    private CourseFactory courseFactory;

    public NotificationDecorator(String materialtype,String title) {

        this.material = new CourseFactory().createCourseMaterial(materialtype, title);

    }

    @Override
    public String getDescription() {
        return material.getDescription();
    }
}
