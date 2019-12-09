package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Persondao;
import com.example.demo.model.Person;
@Component
public class PersonService {
	
	@Autowired
	Persondao perdao;
	
	public void addPerson(Person p) {
		System.out.println("Inside service");
		
		perdao.addperson(p);
		
	}
	
	public List<Person> getPersons() {
		System.out.println("Inside service");
		
		return perdao.getpersons();
		
	}
	public Optional<Person> getpersonBYid(int id){
		System.out.println("Inside service");
		
		return perdao.getpersonBYid(id);
		
	}
	
	public String deletePersonBYid(int id) {
		
		System.out.println("Inside model");
		perdao.deletePersonBYid(id);
		return "Deleted";
	}
	public void updatePerson(Person p) {
		System.out.println("Inside service");
		
		perdao.updatePerson(p);
		
	}
	

}
