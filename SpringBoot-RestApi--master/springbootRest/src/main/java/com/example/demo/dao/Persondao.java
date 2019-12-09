package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Person;
import com.example.demo.repo.Personrepo;

@Component
public class Persondao {
	@Autowired
	Personrepo repo;
	
	public void addperson(Person p) {
		System.out.println("Inside model");
		repo.save(p);
	}
	
	
	public List<Person> getpersons() {
		
		System.out.println("Inside model");
		return repo.findAll();
	}
	
	public Optional<Person> getpersonBYid(int id) {
		
		System.out.println("Inside model");
		return repo.findById(id);
	}
	
	public String deletePersonBYid(int id) {
		
		System.out.println("Inside model"+id);
		repo.deleteById(id);
		return "Deleted";
	}
	
	
	public String updatePerson(Person p) {
		
	
		repo.save(p);
		return "Updated";
	}
}
