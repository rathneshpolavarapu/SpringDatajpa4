package com.example.demo.service;


import java.util.List;

import com.example.demo.model.Vaccine;

public interface Vaccineservice {
	
	public Vaccine searchById(int id);
	
	public List<Vaccine> searchVaccineByIds(List<Integer>ids);
	
	public List<Vaccine>searchVaccineById(Vaccine vac);
 
	public String removeVaccinesByIdsCrud(List<Integer>ids);
}
