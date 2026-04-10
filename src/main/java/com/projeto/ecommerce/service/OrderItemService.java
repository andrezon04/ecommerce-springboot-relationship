package com.projeto.ecommerce.service;

import com.projeto.ecommerce.dto.orderItens.OrderItemReq;
import com.projeto.ecommerce.entities.OrderEntity;
import com.projeto.ecommerce.entities.ProductEntity;
import com.projeto.ecommerce.repositories.OrderItemRepository;
import com.projeto.ecommerce.repositories.OrderRepository;
import com.projeto.ecommerce.repositories.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderItemService {

    public final OrderItemRepository orderItemRepository;
    public final OrderRepository orderRepository;
    public final ProductsRepository productsRepository;

    public OrderItemService(OrderItemRepository orderItemRepository, OrderRepository orderRepository, ProductsRepository productsRepository) {
        this.orderItemRepository = orderItemRepository;
        this.orderRepository = orderRepository;
        this.productsRepository = productsRepository;
    }

    public String create(OrderItemReq req, UUID product_id, UUID order_id){
        ProductEntity product = productsRepository.findById(product_id).orElseThrow(() -> new RuntimeException(""));
        OrderEntity order = orderRepository.findById(product_id).orElseThrow(() -> new RuntimeException(""));
        return "";
    }
}