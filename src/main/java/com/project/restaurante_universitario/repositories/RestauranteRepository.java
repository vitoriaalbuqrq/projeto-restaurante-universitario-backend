package com.project.restaurante_universitario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.restaurante_universitario.entities.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Integer>{

}
