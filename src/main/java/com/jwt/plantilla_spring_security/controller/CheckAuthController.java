package com.jwt.plantilla_spring_security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/validate")
public class CheckAuthController {

    @GetMapping("/checkAuth")
    public ResponseEntity<String> checkAuth() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated() && !"anonymousUser".equals(authentication.getPrincipal())) {
            return ResponseEntity.ok("Usuario autenticado");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("No autenticado");
        }
    }


}