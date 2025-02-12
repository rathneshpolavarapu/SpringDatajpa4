package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vaccine;
import com.example.demo.repo.Vaccinerepo;

@Service
public class Vaccineserviceimpl implements Vaccineservice {

	@Autowired
	private Vaccinerepo repo;

	@Override
	public Vaccine searchById(int id) {
		
		return repo.getReferenceById(id);	
	}

	@Override
	public List<Vaccine> searchVaccineByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return repo.findAllById(ids);
	}

	@Override
	public List<Vaccine> searchVaccineById(Vaccine vac) {
		
		Example<Vaccine> example = Example.of(vac);
		repo.findAll(example);
		return null;
	}

	@Override
	public String removeVaccinesByIdsCrud(List<Integer> ids) {
		// TODO Auto-generated method stub
		
		
		List<Vaccine> Vaccines = repo.findAllById(ids);
		if(Vaccines.size()!=0) {
		repo.deleteAllByIdInBatch(ids);
		return "Deleted";
		}
		return "Not deleted";
	}

	
		
	}
	

	


