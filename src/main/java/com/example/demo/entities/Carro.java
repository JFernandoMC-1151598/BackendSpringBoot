package com.example.demo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Carro implements Serializable{

	@Id
	@Column(nullable=false, length=10)
	private String placa;
	
	@Column(nullable=false, length=20)
	private String color;
	
	@Column(nullable=false, length=50)
	private String marca;
	
	private Integer modelo;
	
	private Integer cilindraje;
	
}
