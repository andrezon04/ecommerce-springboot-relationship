package com.projeto.ecommerce.service;

import com.projeto.ecommerce.dto.user.ReqUserDTO;
import com.projeto.ecommerce.entities.UserEntity;
import com.projeto.ecommerce.enums.RoleEnum;
import com.projeto.ecommerce.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserEntity createUser(ReqUserDTO dto){
        UserEntity user = new UserEntity();

        user.setName(dto.getName());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setEmail(dto.getEmail());
        user.setRoles(RoleEnum.USER);

        userRepository.save(user);

        return user;
    }
}