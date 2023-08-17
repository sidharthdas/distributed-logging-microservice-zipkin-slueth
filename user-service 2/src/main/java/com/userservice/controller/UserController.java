package com.userservice.controller;

import com.userservice.model.Order;
import com.userservice.model.User;
import com.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping("server")
    public String testServer() {
        log.info("server status");
        return "Server is up. . . ";
    }

    @GetMapping("all-users")
    public List<User> getUsers() {
        log.info("In getAllUsers controller");
        return userService.getAllUsers();
    }

    @GetMapping("get-user-by-id/{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        log.info("In getUserById controller");
        return userService.getUserById(userId);
    }

    @PostMapping("add-user")
    public User addUser(@RequestBody User user) {
        log.info("In addUser controller");
        return userService.addUser(user);
    }

    @GetMapping("get-all-orders")
    public List getAllOrderFromOrderService() {
        log.info("In getAllOrderFromOrderService controller");
        return userService.getAllOrderFromOrderService();
    }

}
