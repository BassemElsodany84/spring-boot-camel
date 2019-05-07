
package com.soapassion.camel.springbootcamel.service;

import java.util.Random;

import com.soapassion.camel.springbootcamel.domain.BookRepository;
import com.soapassion.camel.springbootcamel.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private BookRepository books;

    private final Random amount = new Random();

    public Order generateOrder() {
        Order order = new Order();
        order.setAmount(amount.nextInt(10) + 1);
        order.setBook(books.findById(amount.nextInt(2) + 1).get());
        return order;
    }
}
