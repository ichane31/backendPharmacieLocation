package com.example.pharmacyspring.controller;

import com.example.pharmacyspring.entity.Pharmacie;
import com.example.pharmacyspring.entity.Ville;
import com.example.pharmacyspring.repository.PharmacieRepository;
import com.example.pharmacyspring.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pharmacyspring.entity.UserPharmacie;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("pharmacies")
public class PharmacieController {
    @Autowired
    private PharmacieRepository pharmacieRepository;

    @Autowired
    UserService userService;
    @GetMapping("/all")
    public List<Pharmacie> getAllPharmacies(){
        return pharmacieRepository.findAll();
    }

    @ModelAttribute()
    @PostMapping("/add/{id_user}")
    public Pharmacie addPharmacies(@RequestBody  Pharmacie newPharma ,@PathVariable int id_user){
        UserPharmacie userPharmacie = userService.getById(id_user);
        newPharma.setUserPharmacie(userPharmacie );
        return pharmacieRepository.save(newPharma);
}

    @DeleteMapping("/delete/{id}")
    public void deletePharmacies(@PathVariable (required = true) String id){
        pharmacieRepository.deleteById(Integer.parseInt(id));
    }
}
