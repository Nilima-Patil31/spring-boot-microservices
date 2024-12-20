package com.course.management.dao;

import com.course.management.entities.Category;
import com.course.management.entities.Course;
import com.course.management.utils.CategoryRowMapper;
import com.course.management.utils.CourseRowMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class CourseDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Create table
    @PostConstruct
    public void init(){
        String query="create table if not exists course_details(id int primary key,course_title varchar(50) not null,course_desc varchar(100))";
        jdbcTemplate.update(query);
        System.out.println("Table created");
    }

    //Save records
    public Course save(Course course){
        String query="insert into course_details(id,course_title,course_desc) values(?,?,?)";
        int row=jdbcTemplate.update(query,course.getId(),course.getCourse_title(),course.getCourse_desc());
        System.out.println(row +" affected");
        return course;
    }

    //Update records
    public Course update(int courseId, Course newCourse) {
        String query = "update course_details set course_title=?,course_desc=? where id=?";
        int update = jdbcTemplate.update(query,newCourse.getCourse_title(),newCourse.getCourse_desc(), courseId);
        System.out.println(update + "updated");
        newCourse.setId(courseId);
        return newCourse;
    }

    //Delete records
    public void delete(int courseId) {
        String query = "delete from course_details where id=?";
        jdbcTemplate.update(query, courseId);

    }

    //Get all records
    public List<Course> getAll() {
        String query = "select * from course_details";
        /*List<Course> courses=jdbcTemplate.queryForList(query,Course.class);*/
        List<Course> courses = jdbcTemplate.query(query, new CourseRowMapper());
        return courses;
    }

    //Get a record with a single id
    public Course get(int courseId) {
        String query = "select * from course_details where id=?";
        //return jdbcTemplate.queryForObject(query,Course.class,courseId);
        return jdbcTemplate.queryForObject(query, new CourseRowMapper(), courseId);
    }

    //Count records
    public int count(){
        String query="select count(*) from course_details";
        System.out.println("Total Records:="+(jdbcTemplate.queryForObject(query, BigInteger.class)));
        return 0;
    }

    //Seach records using like query
    public List<Course> search(String title){
        String query = "Select * from course_details WHERE course_title LIKE ?";
        String likePattern = title + "%";
        return jdbcTemplate.query(query,new Object[]{likePattern},new CourseRowMapper());
    }

    //Search by title and description
    public List<Course> searchByTitleAndDescription(String key){
        String query = "SELECT * FROM course_details WHERE course_title LIKE ? OR course_desc LIKE ?";
        // String likePattern = "%" + key + "%";
        return jdbcTemplate.query(query, new CourseRowMapper(), key, key);
    }

    //Search category by title
    public Course courseByTitle(String title){
        String query="Select * from course_details where course_title=?";
        return jdbcTemplate.queryForObject(query, new CourseRowMapper(), title);

    }
}
