package com.example.demo.domain.dao;

import com.example.demo.base.RepositoryBase;
import com.example.demo.domain.entities.UserRole;
import com.example.demo.domain.entities.pks.UserRolePK;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleRepository extends RepositoryBase<UserRole, UserRolePK> {
}
