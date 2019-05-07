
package com.soapassion.camel.springbootcamel.service;

import com.soapassion.camel.springbootcamel.domain.Book;
import com.soapassion.camel.springbootcamel.domain.BookRepository;
import com.soapassion.camel.springbootcamel.domain.Order;
import com.soapassion.camel.springbootcamel.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Database {

    @Autowired
    BookRepository books;

    @Autowired
    OrderRepository orders;

    public Iterable<Book> findBooks() {
        return books.findAll();
    }

    public Order findOrder(Integer id) {
        return orders.findById(id).get();
    }
}
