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
public class recResources {
	
	@Autowired
	private RecursosService service;
	
	//Realiza a requisição passando um ID especifico no fim do EndPoint
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		tblrecursos obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	//Realiza a requisição de todos os itens
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> findTodos(){		
		return ResponseEntity.ok().body(service.todos());
	}
	
}
