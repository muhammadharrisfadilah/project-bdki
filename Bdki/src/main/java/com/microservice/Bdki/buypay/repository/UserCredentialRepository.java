package com.microservice.Bdki.buypay.repository;

import com.microservice.Bdki.buypay.entities.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserCredentialRepository extends JpaRepository<UserCredential,String> {
    Optional<UserCredential> findByEmail(String email);
}
