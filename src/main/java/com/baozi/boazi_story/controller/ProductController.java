package com.baozi.boazi_story.controller;

import com.baozi.boazi_story.model.Produto;
import com.baozi.boazi_story.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController 
@RequestMapping("/produtos")
public class ProductController {
	
	@Autowired
	private ProdutoRepository repository;
	
	
	
	@PostMapping
	
	public Produto criar(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@GetMapping
	public List<Produto> Listar(){
		return repository.findAll();
		
	}
	
	
	@GetMapping("/{id}")
	
	public Produto buscarPorId(@PathVariable Long id) {
		return repository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	
	public void deletar(@PathVariable Long id){
		repository.deleteById(id);
	}
}
