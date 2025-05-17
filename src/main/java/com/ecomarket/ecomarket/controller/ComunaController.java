package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Comuna;
import com.ecomarket.ecomarket.repository.ComunaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comunas")
public class ComunaController {

    @Autowired
    private ComunaRepository comunaRepository;

    @GetMapping
    public List<Comuna> getAllComunas() {
        return comunaRepository.findAll();
    }
    // Logica
}
