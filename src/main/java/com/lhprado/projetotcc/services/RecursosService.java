package com.lhprado.projetotcc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhprado.projetotcc.domain.tblrecursos;
import com.lhprado.projetotcc.repositories.recursosRepository;

@Service
public class RecursosService {
	
	@Autowired
	private recursosRepository repo;
	
	public tblrecursos find(Integer id) {
		Optional<tblrecursos> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
public List<tblrecursos> todos(){
	return repo.findAll();
}
	
}
