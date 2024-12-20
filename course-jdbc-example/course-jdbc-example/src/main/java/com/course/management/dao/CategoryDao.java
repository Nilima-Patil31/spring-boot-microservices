package com.course.management.dao;

import com.course.management.entities.Category;
import com.course.management.utils.CategoryRowMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Create Table
    @PostConstruct
    public void init() {
        String createTableQuery = "create table if not EXISTS categories(id int primary key,title varchar(50) not null,description varchar(500))";
        jdbcTemplate.update(createTableQuery);
        System.out.println("Table Created");
    }


    //Update Category
    public Category update(int categoryId, Category newCat) {
        String query = "update categories set title=?,description=? where id=?";
        int update = jdbcTemplate.update(query, newCat.getTitle(), newCat.getDescription(), categoryId);
        System.out.println(update + "updated");
        newCat.setId(categoryId);
        return newCat;
    }

    //Delete Category
    public void delete(int categoryId) {
        String query = "delete from categories where id=?";
        jdbcTemplate.update(query, categoryId);

    }

    //Save Category
    public Category save(Category category) {
        String query = "insert into categories (id,title,description) values(?,?,?)";
        int rows = jdbcTemplate.update(query, category.getId(), category.getTitle(), category.getDescription());
        System.out.print(rows + " affected");
        return category;
    }

    //Get all Category
    public List<Category> getAll() {
        String query = "select * from categories";
        /*List<Category> categories=jdbcTemplate.queryForList(query,Category.class);*/
        List<Category> categories = jdbcTemplate.query(query, new CategoryRowMapper());
        return categories;
    }


    //Get a category with a single id
    public Category get(int categoryId) {
        String query = "select * from categories where id=?";
        //return jdbcTemplate.queryForObject(query,Category.class,categoryId);
        return jdbcTemplate.queryForObject(query, new CategoryRowMapper(), categoryId);
    }

    //Count records
    public int count(){
        String query="select count(*) from categories";
        System.out.println("Total Records:="+(jdbcTemplate.queryForObject(query, BigInteger.class)));
        return 0;
    }

    //Seach records using like query
    public List<Category> search(String title){
        String query = "Select * from categories WHERE title LIKE ?";
        String likePattern = title + "%";
        return jdbcTemplate.query(query,new Object[]{likePattern},new CategoryRowMapper());
    }
    //Search by title and description
    public List<Category> searchByTitleAndDescription(String key){
        String query = "SELECT * FROM categories WHERE title LIKE ? OR description LIKE ?";
       // String likePattern = "%" + key + "%";
        return jdbcTemplate.query(query, new CategoryRowMapper(), key, key);
    }

    //Search category by title
    public Category categoryByTitle(String title){
        String query="Select * from categories where title=?";
        return jdbcTemplate.queryForObject(query, new CategoryRowMapper(), title);

    }

}
