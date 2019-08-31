package com.example.elasticsearch.repository;

import com.example.elasticsearch.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface OrderRepository extends ElasticsearchRepository<Order, String> {

    Page<Order> findByDescription(String description, Pageable pageable);
}
