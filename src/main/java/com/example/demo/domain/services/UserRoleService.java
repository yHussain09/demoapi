package com.example.demo.domain.services;

import com.example.demo.base.ServiceBase;
import com.example.demo.domain.dao.UserRoleRepository;
import com.example.demo.domain.entities.UserRole;
import com.example.demo.domain.entities.pks.UserRolePK;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService extends ServiceBase<UserRole, UserRolePK> {
    public UserRoleService(UserRoleRepository repository) {
        super(repository);
    }
}
