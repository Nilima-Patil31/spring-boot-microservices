package com.course.management.utils;

import com.course.management.entities.Course;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseRowMapper implements RowMapper<Course> {
    @Override
    public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
        Course course=new Course();
        course.setId(rs.getInt("id"));
        course.setCourse_title(rs.getString("course_title"));
        course.setCourse_desc(rs.getString("course_desc"));
        return course;
        
    }
}
