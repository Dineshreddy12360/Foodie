package com.Yarragunta.Dinesh.Kumar.Reddy.myapp.service;

import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.model.Order;
import com.Yarragunta.Dinesh.Kumar.Reddy.myapp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Place new order
    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Delete order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}