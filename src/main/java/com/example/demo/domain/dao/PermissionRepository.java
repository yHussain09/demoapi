package com.example.demo.domain.dao;

import com.example.demo.base.RepositoryBase;
import com.example.demo.domain.entities.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends RepositoryBase<Permission, Long> {
}
