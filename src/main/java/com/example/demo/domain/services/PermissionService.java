package com.example.demo.domain.services;

import com.example.demo.base.ServiceBase;
import com.example.demo.domain.dao.PermissionRepository;
import com.example.demo.domain.entities.Permission;
import org.springframework.stereotype.Service;


@Service
public class PermissionService extends ServiceBase<Permission,Long> {
    public PermissionService(PermissionRepository repository) {
        super(repository);
    }
}
