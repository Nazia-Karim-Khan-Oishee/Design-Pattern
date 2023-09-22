package org.example;

class Slides implements CourseMaterial {
    private String title;

    public Slides(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return "Slide: " + title;
    }
}