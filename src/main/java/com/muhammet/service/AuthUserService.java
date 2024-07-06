package com.muhammet.service;

import com.muhammet.entity.AuthUser;
import com.muhammet.repository.AuthUserRepository;
import com.muhammet.utility.Roles;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthUserService {
    private final AuthUserRepository repository;

    public AuthUser save(String userName, String password, Roles roles) {
        return repository.save(AuthUser.builder()
                        .userName(userName)
                        .password(password)
                        .roles(roles)
                .build());
    }

    public List<AuthUser> getAll() {
        return repository.findAll();
    }
}
