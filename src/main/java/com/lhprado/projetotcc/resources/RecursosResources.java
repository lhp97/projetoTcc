package com.lhprado.projetotcc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lhprado.projetotcc.domain.tblrecursos;
import com.lhprado.projetotcc.services.RecursosService;


@RestController
@RequestMapping(value="/Recursos")
public class RecursosResources {
	
	@Autowired
	private RecursosService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		tblrecursos obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> findTodos(){		
		return ResponseEntity.ok().body(service.todos());
	}
	
}
