package com.orderservice.model;

public record Order(String orderId, String orderName, String orderType, int orderValue) {
}
