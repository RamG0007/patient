package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IdNotFound;
import com.example.demo.model.Patient;

import com.example.demo.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository pr;
	@Override
	public void add(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public List<Patient> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Patient update(Patient p, Integer id) {
		// TODO Auto-generated method stub

		p.setId(id);
		return pr.save(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Patient search(Integer id) {
		// TODO Auto-generated method stub
		if(!pr.existsById(id))
			throw new IdNotFound("ID NOT Found !!");
		return pr.findById(id).get();
	}

}
