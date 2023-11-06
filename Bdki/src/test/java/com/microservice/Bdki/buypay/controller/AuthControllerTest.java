package com.microservice.Bdki.buypay.controller;

import com.microservice.Bdki.buypay.entities.User;
import com.microservice.Bdki.buypay.entities.UserCredential;
import com.microservice.Bdki.buypay.models.auth.AuthRequest;
import org.junit.jupiter.api.Test;

public class AuthControllerTest {

    @Test
    void craateNewUser() {

        AuthRequest authRequest = new AuthRequest();
        authRequest.setEmail("jaka@gmail.com");
        authRequest.setPassword("subhan");
        authRequest.setName("mahmud");
        authRequest.setMobilePhone("08652");

        UserCredential userCredential = new UserCredential();
        userCredential.setEmail(authRequest.getEmail());
        userCredential.setPassword(authRequest.getPassword());

        User user = new User();
        user.setId("uiohjasjdh");
        user.setEmail(authRequest.getEmail());
        user.setName(authRequest.getName());
        user.setPhoneNumber(authRequest.getMobilePhone());
        user.setUserCredential(userCredential);

    }
}
