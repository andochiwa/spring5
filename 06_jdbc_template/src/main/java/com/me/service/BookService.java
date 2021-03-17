package com.me.service;

import com.me.dao.BookDao;
import com.me.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加
    public void add(Book book) {
        bookDao.add(book);
    }

    // 修改
    public void update(Book book) {
        bookDao.update(book);
    }

    public void delete(int id) {
        bookDao.delete(id);
    }

    public int queryCount() {
        return bookDao.queryCount();
    }

    public Book queryObject(int id) {
        return bookDao.queryObject(id);
    }

    public List<Book> queryAll() {
        return bookDao.queryAll();
    }

    public void batchAdd(List<Object[]> batchArgs) {
        bookDao.batchAdd(batchArgs);
    }

}
