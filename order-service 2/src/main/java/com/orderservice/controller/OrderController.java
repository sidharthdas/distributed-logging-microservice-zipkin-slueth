package com.orderservice.controller;

import com.orderservice.model.Order;
import com.orderservice.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @GetMapping("server")
    public String testServer() {
        log.info("server status");
        return "Server is up. . . ";
    }

    @GetMapping("all-Orders")
    public List<Order> getOrders() {
        log.info("In getAllOrders controller");
        return orderService.getAllOrders();
    }

    @GetMapping("get-Order-by-id/{OrderId}")
    public Order getOrderById(@PathVariable("OrderId") String OrderId) {
        log.info("In getOrderById controller");
        return orderService.getOrderById(OrderId);
    }

    @PostMapping("add-Order")
    public Order addOrder(@RequestBody Order Order) {
        log.info("In addOrder controller");
        return orderService.addOrder(Order);
    }
}
