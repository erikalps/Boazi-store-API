package com.baozi.boazi_story.controller;

import com.baozi.boazi_story.model.Cliente;
import com.baozi.boazi_story.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@PostMapping 
	
	public Cliente criar(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@GetMapping
	
	public List<Cliente> Listar(){
		return repository.findAll();
	}
	
	@GetMapping ("/{id}")
	
	public Cliente buscarPorId(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	
	
	@DeleteMapping("/{id}")
	
	public void deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
