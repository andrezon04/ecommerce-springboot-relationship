package com.projeto.ecommerce.dto.user;

import lombok.Data;

@Data
public class ReqUserDTO {
    private String name;
    private String email;
    private String password;
}