package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestController {

	@GetMapping
	public String getTestAll() {
		return "Hola Test";
	}

	@GetMapping("/{id}")
	public String getTest(@PathVariable String id) {
		return "Get " + id;
	}

	@PutMapping("/{id}")
	public String putTest(@PathVariable String id) {
		return "Put";
	}

	@PostMapping
	public String postTest() {
		return "Post";
	}

	@DeleteMapping("/{id}")
	public String deleteTest(@PathVariable String id) {
		return "Delete";
	}

	@GetMapping("/delete/{id}")
	public String getDeleteTest(@PathVariable String id) {
		return "Borramos el ID  " + id;
	}
}
