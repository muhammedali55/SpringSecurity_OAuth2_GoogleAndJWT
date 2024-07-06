package com.muhammet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GoogleRegisterController {

    @GetMapping("/login/oauth2/code/google")
    public ResponseEntity<Object> getGoogle(){
        return ResponseEntity.ok("");
    }

    @GetMapping("/oauth2/authorization/google")
    public ResponseEntity<Object> getGoogle2(){
        return ResponseEntity.ok("");
    }

}
