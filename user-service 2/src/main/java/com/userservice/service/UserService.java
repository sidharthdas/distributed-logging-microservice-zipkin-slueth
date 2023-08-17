package com.userservice.service;

import com.userservice.model.Order;
import com.userservice.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        log.info("In getAllUsers method");
        return users;
    }

    public User getUserById(String userId) {
        log.info("In getUserById method");
        return users
                .stream()
                .filter(x -> x.userId().equals(userId))
                .findFirst()
                .orElse(null);
    }

    public User addUser(User user) {
        log.info("In addUser method");
        users.add(user);
        return user;
    }

    public List getAllOrderFromOrderService() {
        log.info("In getAllOrderFromOrderService method");
        List orderList = restTemplate.getForObject("http://localhost:9094/order/all-Orders", List.class);
        return orderList;
    }
}
