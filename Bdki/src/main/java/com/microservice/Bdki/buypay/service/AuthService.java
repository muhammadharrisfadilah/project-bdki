package com.microservice.Bdki.buypay.service;

import com.microservice.Bdki.buypay.models.auth.AuthRequest;
import com.microservice.Bdki.buypay.models.response.LoginResponse;
import com.microservice.Bdki.buypay.models.response.RegisterResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    RegisterResponse registerUser(AuthRequest request);
    RegisterResponse registerAdmin(AuthRequest request);
    LoginResponse loginUser(AuthRequest request);

}
