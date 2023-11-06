package com.microservice.Bdki.buypay.repository;

import com.microservice.Bdki.buypay.entities.Role;
import com.microservice.Bdki.buypay.entities.constants.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,String> {
    Optional<Role> findByRole(ERole role);
}
