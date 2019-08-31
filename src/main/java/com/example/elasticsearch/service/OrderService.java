package com.example.elasticsearch.service;

import com.example.elasticsearch.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface OrderService {

    Order save(Order order);

    void delete(Order order);

    Order findOne(String id);

    Iterable<Order> findAll();

    Page<Order> findByDescription(String description, PageRequest pageRequest);
}
