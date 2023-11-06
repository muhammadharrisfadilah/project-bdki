package com.microservice.Bdki.buypay.models.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AuthRequest {
    @NotBlank(message = "email is required")
    @Email(message = "email is required")
    private String email;
    private String password;
    private String name;
    private String mobilePhone;
}
