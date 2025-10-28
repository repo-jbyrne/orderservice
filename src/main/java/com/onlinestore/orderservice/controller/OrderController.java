package com.onlinestore.orderservice.controller;

import com.onlinestore.orderservice.entity.Order;
import com.onlinestore.orderservice.entity.Product;
import com.onlinestore.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Product placeOrder(@RequestBody Order order) {
        System.out.println("placeOrder");
        return orderService.placeOrder(order);
    }
}
