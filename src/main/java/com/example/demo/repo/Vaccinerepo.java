package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Vaccine;

public interface Vaccinerepo extends JpaRepository<Vaccine, Integer> {

}
