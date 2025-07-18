package com.medaxis.orderservice.service;


import com.medaxis.orderservice.entity.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    Long create(Order order);
}