package com.example.demo.domain.services;

import com.example.demo.base.ServiceBase;
import com.example.demo.domain.dao.RolePermissionRepository;
import com.example.demo.domain.entities.RolePermission;
import com.example.demo.domain.entities.pks.RolePermissionPK;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionService extends ServiceBase<RolePermission, RolePermissionPK> {
    public RolePermissionService(RolePermissionRepository repository) {
        super(repository);
    }
}
