package com.example.elasticsearch.service.impl;

import com.example.elasticsearch.model.Order;
import com.example.elasticsearch.repository.OrderRepository;
import com.example.elasticsearch.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public void delete(Order order) {
        this.orderRepository.delete(order);
    }

    @Override
    public Order findOne(String id) {
        Optional<Order> order = this.orderRepository.findById(id);
        return order.orElse(null);
    }

    @Override
    public Iterable<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Page<Order> findByDescription(String description, PageRequest pageRequest) {
        return this.orderRepository.findByDescription(description, pageRequest);
    }
}
