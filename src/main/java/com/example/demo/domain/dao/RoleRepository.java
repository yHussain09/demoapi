package com.example.demo.domain.dao;

import com.example.demo.base.RepositoryBase;
import com.example.demo.domain.entities.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends RepositoryBase<Role, Long> {
}
