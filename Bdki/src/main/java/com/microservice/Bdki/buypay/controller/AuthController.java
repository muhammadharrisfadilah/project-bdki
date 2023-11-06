package com.microservice.Bdki.buypay.controller;

import com.microservice.Bdki.buypay.models.auth.AuthRequest;
import com.microservice.Bdki.buypay.models.general.CommonResponse;
import com.microservice.Bdki.buypay.models.response.LoginResponse;
import com.microservice.Bdki.buypay.models.response.RegisterResponse;
import com.microservice.Bdki.buypay.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping(
            path = "/register/user"
    )
    public ResponseEntity<?> registerUser(@RequestBody AuthRequest request){
        RegisterResponse register = authService.registerUser(request);
        CommonResponse<Object> commonResponse = CommonResponse.builder()
                .statusCode(HttpStatus.CREATED.value())
                .message("Successfully registered")
                .data(register)
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(commonResponse);
    }


    @PostMapping("login")
    public ResponseEntity<?> loginUser(@RequestBody AuthRequest request){

        LoginResponse login = authService.loginUser(request);
        CommonResponse<Object> commonResponse = CommonResponse.builder()
                .statusCode(HttpStatus.OK.value())
                .message("succesfully login")
                .data(login)
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(commonResponse);
    }

}
