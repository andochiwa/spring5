package com.me.dao;

import com.me.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into book(name, status) values(?,?)";
        int update = jdbcTemplate.update(sql, book.getName(), book.getStatus());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql = "update book set name = ?, status = ? where id = ?";
        jdbcTemplate.update(sql, book.getName(), book.getStatus(), book.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "delete from book where id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int queryCount() {
        String sql = "select count(*) from book";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public Book queryObject(int id) {
        String sql = "select * from book where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
    }

    @Override
    public List<Book> queryAll() {
        String sql = "select * from book";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into book(name, status) values(?,?)";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
}
