package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class PatientController {

	@Autowired
	private PatientService ps;
	
	@PostMapping("add")
	public void add(@RequestBody Patient p) {
		//TODO: process POST request
		
		ps.add(p);
	}
	
	@GetMapping("display")
	public List<Patient>display() {
		return ps.display();
	}
	
	@PutMapping("update={id}")
	public Patient update(@PathVariable Integer id, @RequestBody Patient p) {
		//TODO: process PUT request
		
		return ps.update(p, id);
	}
	
	@DeleteMapping("delete={id}")
	public void delete(@PathVariable Integer id) {
		ps.delete(id);
	}
	
	@PostMapping("search={id}")
	public ResponseEntity<?> search(@PathVariable Integer id) {
		//TODO: process POST request
		Patient result=ps.search(id);
		return new ResponseEntity<Patient>(result,HttpStatus.OK);
	}
	
	
	
}
