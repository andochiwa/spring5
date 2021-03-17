package com.me.collectiontype;

import java.util.List;

public class Book {

    private List<String> list;

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
