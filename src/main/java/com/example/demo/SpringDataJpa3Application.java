package com.example.demo;


import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Vaccine;
import com.example.demo.service.Vaccineservice;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		Vaccineservice service=container.getBean(Vaccineservice.class);
		
//		System.out.print(service.searchById(2));
		
		ArrayList<Integer> ids=new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
//		
//System.out.print(service.searchVaccineByIds(ids));
		
//		 System.out.print(service.searchVaccineById(new Vaccine("Sputnick","russian",13553.4)));
		
		service.removeVaccinesByIdsCrud(ids);
}

}