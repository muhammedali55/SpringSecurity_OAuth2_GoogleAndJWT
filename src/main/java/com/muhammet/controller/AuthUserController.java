package com.muhammet.controller;

import com.muhammet.entity.AuthUser;
import com.muhammet.service.AuthUserService;
import com.muhammet.utility.Roles;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth-user")
public class AuthUserController {
    private final AuthUserService authUserService;

    @PostMapping("/register")
    public ResponseEntity<AuthUser> register(String userName, String password, Roles roles){
       return ResponseEntity.ok(authUserService.save(
               userName,password,roles
       ));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<AuthUser>> getAll(){
        return ResponseEntity.ok(authUserService.getAll());
    }
}
