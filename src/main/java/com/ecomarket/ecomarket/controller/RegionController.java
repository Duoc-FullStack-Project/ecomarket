package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Region;
import com.ecomarket.ecomarket.repository.RegionRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/regiones")
public class RegionController {

    @Autowired
    private RegionRepository regionRepository;

    @GetMapping
    public List<Region> getAllRegiones() {
        return regionRepository.findAll();
    }
    // Logica
}
