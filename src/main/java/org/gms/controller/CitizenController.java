package org.gms.controller;

import java.util.List;

import org.gms.entity.Citizen;
import org.gms.repository.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/citizen")
public class CitizenController {
	@Autowired
	private CitizenRepo repo;
	
	@GetMapping(path="/id/{id}")
	public ResponseEntity<List<Citizen>> showAll(@PathVariable Integer id){
		
		List<Citizen> citizens=repo.findByVaccinationCenterId(id);
		return new ResponseEntity<>(citizens,HttpStatus.OK);
	}
	@PostMapping(path="/add")
	public void add(@RequestBody Citizen citizen) {
		repo.save(citizen);
	}

}
