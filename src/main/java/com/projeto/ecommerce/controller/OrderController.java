package com.projeto.ecommerce.controller;

import com.projeto.ecommerce.dto.orders.OrderReq;
import com.projeto.ecommerce.entities.OrderEntity;
import com.projeto.ecommerce.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<?> createOrder(@Valid @RequestBody OrderReq req, UUID id) {
        return ResponseEntity.ok(orderService.create(req, id));
    }

}