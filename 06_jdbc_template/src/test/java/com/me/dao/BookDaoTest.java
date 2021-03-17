package com.me.dao;

import com.me.pojo.Book;
import com.me.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

class BookDaoTest {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("bean1.xml");
    BookService bookService = context.getBean("bookService", BookService.class);


    @Test
    void add() {
        bookService.add(new Book(null, "java", "a"));
        bookService.add(new Book(null, "cpp", "a"));
        bookService.add(new Book(null, "golang", "a"));

    }

    @Test
    void update() {
        bookService.update(new Book(2, "cpp", "b"));
    }

    @Test
    void delete() {
        bookService.delete(2);
    }

    @Test
    void queryCount() {
        System.out.println(bookService.queryCount());
    }

    @Test
    void queryBook() {
        System.out.println(bookService.queryObject(3));
    }

    @Test
    void queryAll() {
        List<Book> books = bookService.queryAll();
        books.forEach(System.out::println);
    }

    @Test
    void batchAdd() {
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"c", "c"};
        Object[] o2 = {"d", "d"};
        Object[] o3 = {"e", "e"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }
}