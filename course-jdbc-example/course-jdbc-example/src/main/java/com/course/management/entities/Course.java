package com.course.management.entities;

public class Course {
    private int id;
    private String course_title;
    private String course_desc;

    public Course() {
    }

    public Course(int id, String course_title, String course_desc) {
        this.id = id;
        this.course_title = course_title;
        this.course_desc = course_desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }
}
