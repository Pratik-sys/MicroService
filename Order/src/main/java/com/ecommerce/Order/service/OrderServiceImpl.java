package com.ecommerce.Order.service;

import com.ecommerce.Order.model.Order;
import com.ecommerce.Order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void deleteOrderByID(String id) {

    }

    @Override
    public void confirmOrder() {

    }

    @Override
    public List<Order> listAllOrders() {
        return List.of();
    }
}