package com.jwt.plantilla_spring_security.service;

import com.jwt.plantilla_spring_security.Dto.AuthResponse;
import com.jwt.plantilla_spring_security.Dto.AuthenticationRequest;
import com.jwt.plantilla_spring_security.Dto.RegisterRequest;

public interface AuthService {

    AuthResponse authenticate(AuthenticationRequest request);

    AuthResponse register(RegisterRequest request);



}
