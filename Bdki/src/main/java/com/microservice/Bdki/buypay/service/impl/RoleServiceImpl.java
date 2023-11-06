package com.microservice.Bdki.buypay.service.impl;

import com.microservice.Bdki.buypay.entities.Role;
import com.microservice.Bdki.buypay.entities.constants.ERole;
import com.microservice.Bdki.buypay.repository.RoleRepository;
import com.microservice.Bdki.buypay.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public Role getOrSave(ERole role) {
        return roleRepository.findByRole(role).orElseGet(()-> roleRepository.save(Role
                .builder().role(role)
                .build()));
    }
}
