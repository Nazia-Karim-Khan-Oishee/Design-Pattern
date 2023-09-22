package org.example;

class Lecture implements CourseMaterial {
    private String title;

    public Lecture(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Lecture: " + title;
    }
}