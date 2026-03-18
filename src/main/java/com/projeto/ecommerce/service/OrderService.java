package com.projeto.ecommerce.service;

import com.projeto.ecommerce.dto.orders.OrderReq;
import com.projeto.ecommerce.dto.orders.OrderRes;
import com.projeto.ecommerce.entities.OrderEntity;
import com.projeto.ecommerce.entities.PaymentEntity;
import com.projeto.ecommerce.entities.UserEntity;
import com.projeto.ecommerce.enums.OrderStatus;
import com.projeto.ecommerce.repositories.OrderRepository;
import com.projeto.ecommerce.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderService(OrderRepository orderRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public OrderRes create(OrderReq req, UUID userId) {
        UserEntity user = userRepository.getReferenceById(userId);
        OrderEntity order = new OrderEntity();
        order.setMoment(LocalDate.now());
        order.setStatus(OrderStatus.AWAITING_PAYMENT);
        order.setPayment(new PaymentEntity());
        order.setClient(user);

        return new OrderRes(user);
    }
}