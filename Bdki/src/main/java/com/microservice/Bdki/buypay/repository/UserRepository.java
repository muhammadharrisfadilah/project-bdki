package com.microservice.Bdki.buypay.repository;

import com.microservice.Bdki.buypay.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {
    Optional<User> findFirstByEmail(String email);
    Optional<User> findFirstById(String id);
    Optional<User> findFirstByPhoneNumber(String phoneNumber);
    Optional<User> findByEmail(String email);
}
