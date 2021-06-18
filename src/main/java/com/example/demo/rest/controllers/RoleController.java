package com.example.demo.rest.controllers;

import com.example.demo.base.RestControllerBase;
import com.example.demo.base.ServiceBase;
import com.example.demo.domain.entities.Role;
import com.example.demo.domain.services.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/role")
public class RoleController extends RestControllerBase<Role, Long> {
    public RoleController(RoleService service) {
        super(service);
    }
}
