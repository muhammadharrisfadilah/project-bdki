package com.microservice.Bdki.buypay.models.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CreateUserRequest {
    private String name;
    @NotBlank(message = "email is required")
    @Email(message = "invalid email")
    private String email;
    private String password;
    private String phoneNumber;
    private String payCode;

}
