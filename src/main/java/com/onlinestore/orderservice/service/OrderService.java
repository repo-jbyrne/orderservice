package com.onlinestore.orderservice.service;

import com.onlinestore.orderservice.client.ProductClient;
import com.onlinestore.orderservice.entity.Order;
import com.onlinestore.orderservice.entity.Product;
import com.onlinestore.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private ProductClient productClient;

    @Autowired
    public OrderService(OrderRepository orderRepository, ProductClient productClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
    }

    public Product placeOrder(Order order) {
        Product product = productClient.getProductById(12L);
        System.out.println("Returned Product: " + product);

        return product;
    }
}
