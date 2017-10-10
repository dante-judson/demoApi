package com.g4flex.desafiog4api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.g4flex.desafiog4api.model.Contato;
import com.g4flex.desafiog4api.repository.ContatoRepository;

@RestController
@CrossOrigin
@RequestMapping("/contato")
public class ContatoResource {
	
	@Autowired
	private ContatoRepository repository;
	
	@GetMapping
	public List<Contato> listAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Contato findOne(@PathVariable Long id) {
		return repository.findOne(id);
	}
	
	@PostMapping
	public Contato save(@RequestBody Contato contato) {
		return repository.save(contato);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value=HttpStatus.ACCEPTED)
	public boolean remove(@PathVariable Long id) {
		repository.delete(id);
		return true;
	}
}
