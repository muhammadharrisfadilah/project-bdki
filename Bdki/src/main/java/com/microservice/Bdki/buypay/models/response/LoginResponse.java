package com.microservice.Bdki.buypay.models.response;

import com.microservice.Bdki.buypay.entities.Role;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class LoginResponse {
    private String email;
    private String token;
    private List<Role> roles;
}
