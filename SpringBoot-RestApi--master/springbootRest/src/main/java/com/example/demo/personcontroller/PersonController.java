package com.example.demo.personcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService perSer;
	
	@PostMapping(path="/person")
	public void addPerson(@RequestBody Person p) {
		System.out.println("inside cotroller");
		perSer.addPerson(p);
	}
	
	@GetMapping(path="/person")
	public List<Person> getPersons() {
		
		return perSer.getPersons();
	}
	
	@GetMapping(path="/person/{id}")
	public Optional<Person> getPersons(@PathVariable int id) {
		
		return perSer.getpersonBYid(id);
	}
	
	@DeleteMapping(path="/person/{id}")
	public String deletePerson(@PathVariable int id) {
		
		 perSer.deletePersonBYid(id);
		 return "Deleted";
	}
	@PutMapping(path="/person")
	public void updatePerson(@RequestBody Person p) {
		System.out.println("inside cotroller");
		perSer.updatePerson(p);
	}

}
