package com.microservice.Bdki.buypay.service;

import com.microservice.Bdki.buypay.entities.Role;
import com.microservice.Bdki.buypay.entities.constants.ERole;

public interface RoleService {
    Role getOrSave(ERole role);
}
