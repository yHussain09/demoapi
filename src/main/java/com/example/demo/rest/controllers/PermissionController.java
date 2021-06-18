package com.example.demo.rest.controllers;

import com.example.demo.base.RestControllerBase;
import com.example.demo.domain.entities.Permission;
import com.example.demo.domain.services.PermissionService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/permission")
public class PermissionController extends RestControllerBase<Permission, Long> {
    public PermissionController(PermissionService service) {
        super(service);
    }
}
