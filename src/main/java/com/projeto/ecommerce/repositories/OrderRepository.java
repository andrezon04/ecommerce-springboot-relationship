package com.projeto.ecommerce.repositories;

import com.projeto.ecommerce.dto.OrderDTO;
import com.projeto.ecommerce.entities.OrderEntity;
import com.projeto.ecommerce.enums.StatusDoPedido;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class OrderRepository {
    private final OrderRepository orderRepository;

    public OrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO create() {
        OrderEntity order = new OrderEntity();
        order.setMoment(LocalDate.now());
        order.setStatus(StatusDoPedido.AWAITING_PAYMENT);



        return ;
    }

}