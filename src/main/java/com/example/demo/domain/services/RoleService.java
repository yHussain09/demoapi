package com.example.demo.domain.services;

import com.example.demo.base.ServiceBase;
import com.example.demo.domain.dao.RoleRepository;
import com.example.demo.domain.entities.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends ServiceBase<Role, Long> {
    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
