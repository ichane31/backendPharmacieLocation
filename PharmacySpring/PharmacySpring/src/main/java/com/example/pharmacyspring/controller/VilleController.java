package com.example.pharmacyspring.controller;

import com.example.pharmacyspring.entity.Ville;
import com.example.pharmacyspring.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("villes")
public class VilleController {
    @Autowired
    private VilleRepository villeRepository;
    @GetMapping("/all")
    public List<Ville> getAllVilles(){
        return villeRepository.findAll();
    }
    @GetMapping("/{nameVille}")
    public Ville getVilleByName(@PathVariable  String nameVille) {
        return  villeRepository.findByNomLikeIgnoreCase(nameVille);
    }
    @PutMapping("/edit/{id}")
    public void updateVille(@RequestBody Ville ville,@PathVariable int id){
         Ville ville1 = villeRepository.findById(id).get();
         ville1.setNom(ville.getNom());
         villeRepository.save(ville1);
    }
    @PostMapping("/add")
    public Ville addVille(@RequestBody Ville newVille){
        return villeRepository.save(newVille);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteVille(@PathVariable (required = true) String id){
       villeRepository.deleteById(Integer.parseInt(id));
    }

}
