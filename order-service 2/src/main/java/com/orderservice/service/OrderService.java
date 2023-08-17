package com.orderservice.service;

import com.orderservice.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);
    List<Order> Orders = new ArrayList<>();

    public List<Order> getAllOrders() {
        log.info("In getAllOrders method");
        return Orders;
    }

    public Order getOrderById(String OrderId) {
        log.info("In getOrderById method");
        return Orders
                .stream()
                .filter(x -> x.orderId().equals(OrderId))
                .findFirst()
                .orElse(null);
    }

    public Order addOrder(Order Order) {
        log.info("In addOrder method");
        Orders.add(Order);
        return Order;
    }
}
