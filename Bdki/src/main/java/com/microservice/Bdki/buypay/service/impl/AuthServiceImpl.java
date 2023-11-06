package com.microservice.Bdki.buypay.service.impl;

import com.microservice.Bdki.buypay.entities.Role;
import com.microservice.Bdki.buypay.entities.User;
import com.microservice.Bdki.buypay.entities.UserCredential;
import com.microservice.Bdki.buypay.entities.constants.ERole;
import com.microservice.Bdki.buypay.models.auth.AuthRequest;
import com.microservice.Bdki.buypay.models.response.LoginResponse;
import com.microservice.Bdki.buypay.models.response.RegisterResponse;
import com.microservice.Bdki.buypay.repository.UserCredentialRepository;
import com.microservice.Bdki.buypay.repository.UserRepository;
import com.microservice.Bdki.buypay.service.AuthService;
import com.microservice.Bdki.buypay.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final UserCredentialRepository userCredentialRepository;
//    private final AuthenticationManager authenticationManager;
    private final RoleService roleService;
    @Override
    public RegisterResponse registerUser(AuthRequest request) {
        try {
            Role role = roleService.getOrSave(ERole.ROLE_REGULAR_USER);
            UserCredential userCredential = UserCredential.builder()
                    .email(request.getEmail())
                    .password(request.getPassword())
//                    .roles(List.of(role))
                    .build();

            userCredentialRepository.saveAndFlush(userCredential);

            User user = User.builder()
                    .email(request.getEmail())
                    .name(request.getName())
                    .phoneNumber(request.getMobilePhone())
                    .userCredential(userCredential)
                    .build();
            user.setBalance(BigDecimal.ZERO);
            user.setIsPremium(false);

            userRepository.saveAndFlush(user);

            return RegisterResponse.builder()
                    .email(userCredential.getEmail())
                    .build();

        }catch (DataIntegrityViolationException e){
            throw new ResponseStatusException(HttpStatus.CONFLICT,"user already exist");
        }
    }

    @Override
    public RegisterResponse registerAdmin(AuthRequest request) {
        return null;
    }

    @Override
    public LoginResponse loginUser(AuthRequest request) {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                request.getEmail(),request.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        UserDetailImpl userDetail = (UserDetailImpl) authentication.getPrincipal;


        try {
            User user = userRepository.findByEmail(request.getEmail())
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "email user tidak ditemukan"));
        }catch (Exception e){
            e.printStackTrace();
        }

        return LoginResponse.builder()
                .email(request.getEmail())
                .build();
    }
}
