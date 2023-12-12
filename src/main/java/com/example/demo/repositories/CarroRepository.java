package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, String> {

	
}
