package com.course.management;

import com.course.management.dao.CategoryDao;
import com.course.management.dao.CourseDao;
import com.course.management.entities.Category;
import com.course.management.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CourseJdbcExampleApplication implements CommandLineRunner {
	@Autowired
	private CategoryDao categoryDao;

	@Autowired
	private CourseDao courseDao;
	public static void main(String[] args) {
		SpringApplication.run(CourseJdbcExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//*************************Category Details*************************
		/*System.out.println("Application started");
		//Create category
		Category category=new Category();
		category.setId(4);
		category.setTitle("live batches-4");
		category.setDescription("This is a live batches-4 category");
		Category savedCategory=categoryDao.save(category);
		System.out.println("category created with id"+savedCategory.getId());*/

		//Get All categories
		/*List<Category> listCategories=categoryDao.getAll();
		listCategories.forEach(category -> {
			System.out.println(category.getTitle()+"\t"+category.getId());
		});*/

		//Get single category
		/*Category category=categoryDao.get(1);
		System.out.println(category.getTitle());*/

		//Delete category
		//categoryDao.delete(2);

		//Count total records
  		//categoryDao.count();

		//Seach records using like query
		/*List<Category> categories=categoryDao.search("live");
		categories.forEach(category -> {
			System.out.println(category.getId()+"\t"+category.getTitle()+"\t"+category.getDescription());
		});*/

		//Search category by title
		/*List<Category> categories=categoryDao.search("live batches-4");
		categories.forEach(category -> {
			System.out.println(category.getId()+"\t"+category.getTitle()+"\t"+category.getDescription());
		});*/

		//Search by title and description
		/*List<Category> categories=categoryDao.searchByTitleAndDescription("This is a live batches category");
		categories.forEach(category -> {
			System.out.println(category.getId()+"\t"+category.getTitle()+"\t"+category.getDescription());
		});*/

		//*************************Course Details*************************
		//Create category
		/*Course course=new Course();
		course.setId(5);
		course.setCourse_title("hgfhfhj");
		course.setCourse_desc("python lhghgfanguage");
		Course savedCourse=courseDao.save(course);
		System.out.println("course created with id "+savedCourse.getId());*/

		//Get All records
		/*List<Course> listCourses=courseDao.getAll();
		listCourses.forEach(course -> {
			System.out.println(course.getCourse_title()+"\t"+course.getId());
		});
*/
		//Get single record
		/*Course course=courseDao.get(1);
		System.out.println(course.getCourse_title());*/

		//Delete course
		//courseDao.delete(5);

		//Count total records
		//courseDao.count();

		//Seach records using like query
		/*List<Course> courses=courseDao.search("c");
		courses.forEach(course
				-> {
			System.out.println(course.getId()+"\t"+course.getCourse_title()+"\t"+course.getCourse_desc());
		});*/

		//Search  by title
		/*List<Course> courses=courseDao.search("java");
		courses.forEach(course -> {
			System.out.println(course.getId()+"\t"+course.getCourse_title()+"\t"+course.getCourse_desc());
		});*/

		//Search by title and description
		/*List<Course> courses=courseDao.searchByTitleAndDescription("c");
		courses.forEach(course -> {
			System.out.println(course.getId()+"\t"+course.getCourse_title()+"\t"+course.getCourse_desc());
		});
*/
	}
}
