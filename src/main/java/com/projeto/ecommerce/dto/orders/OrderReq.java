package com.projeto.ecommerce.dto.orders;

import com.projeto.ecommerce.entities.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderReq {
    private UUID id;
    private UserEntity client;
}