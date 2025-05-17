package com.ecomarket.ecomarket.controller;

import com.ecomarket.ecomarket.model.Compra;
import com.ecomarket.ecomarket.repository.CompraRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compra")
public class CompraController {

    @Autowired
    private CompraRepository compraRepository;

    @GetMapping
    public List<Compra> getAllCompras() {
        return compraRepository.findAll();
    }
    // Logica
}
