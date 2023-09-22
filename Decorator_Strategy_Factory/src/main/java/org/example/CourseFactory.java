package org.example;

public class CourseFactory {
    public CourseMaterial createCourseMaterial(String materialType, String title) {
        if (materialType.equalsIgnoreCase("Lecture")) {
            return new Lecture(title);
        }
        if (materialType.equalsIgnoreCase("Slides")) {
            return new Slides(title);
        }

        return null;
    }
    public CourseMaterial createCourseMaterialviaNotificatio(String materialType, String title) {

//        if (materialType.equalsIgnoreCase("materialwithnotification")) {
            return new MaterialwithNotification(materialType, title);
//        }
//        return null;
    }
}
