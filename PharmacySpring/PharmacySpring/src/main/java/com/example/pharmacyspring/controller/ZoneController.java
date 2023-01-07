package com.example.pharmacyspring.controller;

import com.example.pharmacyspring.entity.Ville;
import com.example.pharmacyspring.entity.Zone;
import com.example.pharmacyspring.repository.VilleRepository;
import com.example.pharmacyspring.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("zones")
public class ZoneController {
    @Autowired
    private ZoneRepository zoneRepository;
    @Autowired
    private VilleRepository villeRepository;
    @GetMapping("/all")
    public List<Zone> getAllZones(){
        return zoneRepository.findAll();
    }

    @GetMapping("/{namezone}")
    public Zone getZoneByName(@PathVariable  String namezone) {
        return zoneRepository.findByNomLikeIgnoreCase(namezone);
    }

    @PostMapping("/add")
    public Zone addZone(@RequestBody Zone newZone){
        return zoneRepository.save(newZone);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteZone(@PathVariable (required = true) String id){
        zoneRepository.deleteById(Integer.parseInt(id));
    }

}
