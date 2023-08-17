package com.userservice.model;

public record Order(String orderId, String orderName, String orderType, int orderValue) {
}
