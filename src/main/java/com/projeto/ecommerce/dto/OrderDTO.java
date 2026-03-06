package com.projeto.ecommerce.dto;

import com.projeto.ecommerce.enums.StatusDoPedido;

import java.time.LocalDate;
import java.util.UUID;

public class OrderDTO {

    private UUID id;
    private LocalDate moment;
    private StatusDoPedido status;
    private UUID client;

    public OrderDTO(UUID id, LocalDate moment, StatusDoPedido status, UUID client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public UUID getClient() {
        return client;
    }

    public void setClient(UUID client) {
        this.client = client;
    }
}