package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	void add(Patient p);
	List<Patient>display();
	Patient update(Patient p, Integer id);
	void delete(Integer id);
	Patient search(Integer id);
	
}
