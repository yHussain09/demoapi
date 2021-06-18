package com.example.demo.rest.controllers;

import com.example.demo.base.RestControllerBase;
import com.example.demo.domain.entities.UserRole;
//import com.example.demo.domain.services.UserAuthorityService;
import com.example.demo.domain.entities.pks.UserRolePK;
import com.example.demo.domain.services.UserRoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/userRole")
public class UserRoleController extends RestControllerBase<UserRole, UserRolePK> {
    public UserRoleController(UserRoleService service) {
        super(service);
    }
}
