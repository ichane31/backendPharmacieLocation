package com.example.pharmacyspring.services;

import com.example.pharmacyspring.entity.UserPharmacie;
import com.example.pharmacyspring.repository.UserPharmacieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
    private UserPharmacieRepository userpharmacierepo;


    public UserPharmacie getById(int id) {
        return userpharmacierepo.findById(id).get();
    }
}
