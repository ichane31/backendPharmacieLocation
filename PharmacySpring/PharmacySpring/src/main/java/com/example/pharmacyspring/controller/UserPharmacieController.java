package com.example.pharmacyspring.controller;

import com.example.pharmacyspring.entity.UserPharmacie;
import com.example.pharmacyspring.repository.UserPharmacieRepository;
import com.example.pharmacyspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("userpharmacie")
public class UserPharmacieController {
    @Autowired
    UserPharmacieRepository userPharmacieRepository;
    @Autowired
    UserService userService;
    @GetMapping("/all")
    public List<UserPharmacie> findAll(){
        return userPharmacieRepository.findAll();
    }
    @PostMapping("/add")
    public UserPharmacie addUserPharmacie(@RequestBody UserPharmacie userPharmacie) {
        return userPharmacieRepository.save(userPharmacie);
    }
    @GetMapping("/{id}")
    public UserPharmacie getById(@PathVariable int id) {
        return userService.getById(id);
    }
    @PostMapping("/auth")
    public UserPharmacie auth(@RequestBody UserPharmacie userPharmacie){
        return userPharmacieRepository.auth(userPharmacie.getUsername(), userPharmacie.getPassword());

    }
}
