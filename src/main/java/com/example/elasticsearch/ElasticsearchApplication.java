package com.example.elasticsearch;

import com.example.elasticsearch.model.Order;
import com.example.elasticsearch.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.time.LocalDateTime;

@SpringBootApplication
public class ElasticsearchApplication {

	private final OrderService orderService;

	@Autowired
	public ElasticsearchApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchApplication.class, args);
	}


	@Bean
	CommandLineRunner lookup() {
		return args -> this.orderService.save(new Order("1", "TV 42", LocalDateTime.now()));
	}
}
