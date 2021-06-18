package com.example.demo.rest.controllers;

import com.example.demo.base.RestControllerBase;
import com.example.demo.base.ServiceBase;
import com.example.demo.domain.entities.User;
import com.example.demo.domain.services.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController extends RestControllerBase<User, Long> {


    private final UserService userService;

    public UserController(UserService service) {
        super(service);
        this.userService = service;
    }

    @PostMapping("/register")
    public ResponseEntity<User> saveUser (User user){
        return this.userService.save(user);
    }





    /*@GetMapping("/")
    public List<User> getAllUsers (){
        return this.userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserByUserId (@PathVariable String id) throws UserPrincipalNotFoundException {
        return this.userService.getUserById(id);
    }



    @PutMapping("/")
    public User updateUser(User user){
        return this.userService.saveUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable String id){
        this.userService.deleteUserById(id);
    }*/
}
