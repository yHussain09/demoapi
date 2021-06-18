package com.example.demo.domain.dao;

import com.example.demo.base.RepositoryBase;
//import com.example.demo.domain.entities.UserRole;
import com.example.demo.domain.entities.RolePermission;
import com.example.demo.domain.entities.pks.RolePermissionPK;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends RepositoryBase<RolePermission, RolePermissionPK> {
}
