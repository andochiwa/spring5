package com.me.dao;

import com.me.pojo.Book;

import java.util.List;

public interface BookDao {
    /**
     * 添加
     * @param book
     */
    void add(Book book);

    void update(Book book);

    void delete(int id);

    int queryCount();

    Book queryObject(int id);

    List<Book> queryAll();

    void batchAdd(List<Object[]> batchArgs);
}
