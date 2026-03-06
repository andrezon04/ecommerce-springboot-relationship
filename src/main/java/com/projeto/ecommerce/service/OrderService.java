package com.projeto.ecommerce.service;

import com.projeto.ecommerce.enums.StatusDoPedido;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


public class OrderService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate moment;
    private StatusDoPedido status;

    public void create() {

    }

}