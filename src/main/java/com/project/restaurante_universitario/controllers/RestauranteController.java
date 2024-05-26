package com.project.restaurante_universitario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.restaurante_universitario.dto.RestauranteDTO;
import com.project.restaurante_universitario.services.RestauranteService;

@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping("/{id}")
    public ResponseEntity<RestauranteDTO> findById(@PathVariable Integer id) {
        RestauranteDTO restauranteDTO = restauranteService.findById(id);
        return ResponseEntity.ok(restauranteDTO);
    }

    @GetMapping
    public List<RestauranteDTO> findAll() {
        List<RestauranteDTO> restauranteDTO = restauranteService.findAll();
        return restauranteDTO;
    }

    @PostMapping
    public ResponseEntity<RestauranteDTO> create(@RequestBody RestauranteDTO restauranteDTO) {
        RestauranteDTO savedRestaurante = restauranteService.create(restauranteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRestaurante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestauranteDTO> update(@PathVariable Integer id, @RequestBody RestauranteDTO restauranteDTO) {
        RestauranteDTO updatedRestaurante = restauranteService.update(id, restauranteDTO);
        return ResponseEntity.ok(updatedRestaurante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        restauranteService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
